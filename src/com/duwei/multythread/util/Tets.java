package com.duwei.multythread.util;

public class Tets {
    public static void main(String[] args) {

        for (int i = 0;i<5 ;i++){
            new Thread(() -> {
                try {
                    Thread.sleep(3000);
                    System.out.println(Thread.currentThread().getName() + "2222");
                } catch (Exception e) {

                }
            }).start();
        }

        System.out.println("...........");

    }

}
