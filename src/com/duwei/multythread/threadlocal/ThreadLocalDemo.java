package com.duwei.multythread.threadlocal;

public class ThreadLocalDemo {

    public static void main(String[] args) {
        ThreadLocal<Integer> mThreadLocal = new ThreadLocal<>();
        mThreadLocal.set(1);
        System.out.println(mThreadLocal.get());

        new Thread("thread-1"){
            @Override
            public void run() {
                super.run();
                mThreadLocal.set(2);
                System.out.println(mThreadLocal.get());
            }
        }.start();
    }


}
