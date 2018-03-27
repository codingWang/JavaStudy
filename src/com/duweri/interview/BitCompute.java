package com.duweri.interview;

/**
 * 位运算Demo
 *
 * @author 杜伟
 */
public class BitCompute {

    public static void main(String[] args) {
        //异或
        int a = 8;//1000
        int b = 9;//1001
        ////////////0001
        System.out.println("a^b = " + (a ^ b));

        int x = 15;//01111=1+2+4+8
        int y = 23;//10111=1+2+4+16
        /////////////11000=16+8=24
        System.out.println("x^y = " + (x ^ y));

        //与运算
        //int x = 15;//01111=1+2+4+8
        //int y = 23;//10111=1+2+4+16
        ///////////////00111=4+2+1=7
        System.out.println("x&y = " + (x & y));

        //或运算
        //int x = 15;//01111=1+2+4+8
        //int y = 23;//10111=1+2+4+16
        ///////////////11111=16+8+4+2+1=31
        System.out.println("x|y = " + (x | y));

        //左右移运算
        //0000 1000>>0000 0010
        //0000 1000<<0010 0000
        System.out.println("8>>2 = " + (8 >> 2));//2
        System.out.println("8<<2 = " + (8 << 2));//32
        System.out.println("8<<2 = " + (8 << 5));//256
        System.out.println("1<<32 = " + (1 << 32));//1

        //~		原码01000放进计算机用补码：01000，
        //取反计算：10111（这是补码），输出源码（取反加1，符号位不变）：11001
        System.out.println("~ = " + (~8));

        System.out.println("8>>>2=" + (8 >>> 2));

    }

}
