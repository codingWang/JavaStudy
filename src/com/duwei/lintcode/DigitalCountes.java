package com.duwei.lintcode;

/**
 * 计算数字k在0到n中的出现的次数，k可能是0~9的一个值
 */
public class DigitalCountes {

    public int digitCounts(int k, int n) {
        // write your code here
        int num = 0;
        while(n >= 0){
            int m = n;
            if(m == 0 && k ==0){
                num++;
            }else{
                while(m != 0){
                    if(m%10 == k){
                        num++;
                    }
                    m = m/10;
                }
            }
            n--;
        }
        return num;
    }

}
