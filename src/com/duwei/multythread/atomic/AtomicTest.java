package com.duwei.multythread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * i++ 和 ++i 不满足线程的原子性，可以使用AtomicInteger来进行线程安全的++操作
 */
public class AtomicTest {

    private static AtomicInteger count = new AtomicInteger(0);
    private static final int times = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Thread decThread = new DecThread();
        decThread.start();

        for (int i = 0; i < times; i++) {
            count.incrementAndGet();
        }

        // 等待decThread结束
        while (decThread.isAlive()) ;
    }

    private static class DecThread extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < times; i++) {
                count.decrementAndGet();
            }
        }
    }
}
