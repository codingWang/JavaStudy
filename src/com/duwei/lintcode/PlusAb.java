package com.duwei.lintcode;

/**
 * 不使用+运算符计算和
 */
public class PlusAb {

    public int add(int a, int b) {
        if ((a & b) == 0) {//无进位情况
            return a | b;
        }

        int d = a ^ b;
        int c = (a & b) << 1;//进位

        while ((d & c) != 0){
            c = c<<1;
        }

        return c;
    }


    public static void main(String[] args) {
        System.out.print(new PlusAb().add(1,1));
    }

}
