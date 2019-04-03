package com.duwei.multythread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * 生产者消费者问题
 * http://developer.51cto.com/art/201508/487488.htm
 *
 * @author 杜伟
 */
public class ProducerConsumerInJava {

    public static void main(String args[]) {
        System.out.println("如何在java中使用 wait and notify");
        System.out.println("解决生产者消费者问题");
        Queue<Integer> buffer = new LinkedList<>();
        int maxSize = 10;
        Thread producer = new Producer(buffer, maxSize, "PRODUCER");
        Thread consumer = new Consumer(buffer, maxSize, "CONSUMER");
        producer.start();
        consumer.start();
    }
}

class Producer extends Thread {
    private Queue<Integer> queue;
    private int maxSize;

    public Producer(Queue<Integer> queue, int maxSize, String name) {
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.size() == maxSize) {
                    try {
                        System.out.println("队列满,生产者等待 ");
                        queue.wait();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
                Random random = new Random();
                int i = random.nextInt();
                System.out.println("产生值 : " + i);
                queue.add(i);
                queue.notifyAll();
            }
        }
    }
}

class Consumer extends Thread {
    private Queue<Integer> queue;
    private int maxSize;

    public Consumer(Queue<Integer> queue, int maxSize, String name) {
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.isEmpty()) {
                    System.out.println("队列空" + "-消费者等待-" + "生产者放数据");
                    try {
                        queue.wait();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
                System.out.println("消费 : " + queue.remove());
                queue.notifyAll();
            }
        }
    }
} 