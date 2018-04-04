package com.duwei.lintcode;

/**
 * 设计一个算法，计算出n阶乘中尾部零的个数
 * <p>
 * 您在真实的面试中是否遇到过这个题？
 * 样例
 * 11! = 39916800，因此应该返回 2
 */
public class HowManyZero {

    public static void main(String[] args) {
        new HowManyZero().trailingZeros(11);
    }


    public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        long m = n+1;
        int sum = 1;
        while (m-- > 1) {
            System.out.println(m);
            sum *= m;
        }
        System.out.println(sum);
        int num = 0;
        while (sum % 10 == 0) {
            sum = sum/10;
            num++;
        }
        System.out.println(num);
        return num;
    }
}
