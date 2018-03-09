package com.duwei.multythread.create;

import java.util.concurrent.*;

/**
 * 创建线程的几种方式
 */
public class CreateThread {

    public static void main(String[] args) {


//003
        MyCallable myCallable = new MyCallable();
        FutureTask futureTask = new FutureTask(myCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
//004
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        MyCallable myThread31 = new MyCallable();
        Future future = executorService.submit(myThread31);
        try {
            System.out.print(future.get());//堵塞的
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    /**
     * 001:继承Thread类
     */
    public static class MyThread extends Thread {
        @Override
        public void run() {
            super.run();
            System.out.println("run");
        }
    }

    /**
     * 002:实现runnable接口
     */
    public static class MyThread2 implements Runnable{
        @Override
        public void run() {

        }
    }

    /**
     * 003:实现callable接口，使用FutureTask包装
     */
    public static class MyCallable implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            return 100;
        }
    }


}
