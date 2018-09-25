package com.duweri.interview;

import java.util.ArrayList;
import java.util.List;

public class FinalTest {
    public static final int a = 1;
    public static final int d = 1 << 1;//2
    public static final int b = 1 << 2;//4
    public static final int c = 1 << 3;//8


    public static void main(String[] args) {
        System.out.println("d = " + d + "b = " + b + "c = " + c);

        int a = 10;
        System.out.println((a >> 1) + 5);
        System.out.println(a >> 1);
        System.out.println(a << 1);
        final List<String> list = new ArrayList<>(10);
        System.out.println(list.size());
        for (int i = 0; i < 15; i++) {
            list.add(i + "");
        }
        System.out.println(list.size());
        for (String string : list) {
            System.out.println(string);
        }


    }


}
