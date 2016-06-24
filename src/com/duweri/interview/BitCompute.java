package com.duweri.interview;
/**
 * 位运算Demo
 * @author 杜伟
 * 
 */
public class BitCompute {

	public static void main(String[] args) {
		//异或
		int a = 8;//1000
		int b = 9;//1001
		System.out.println(a^b);
		
		int x = 15;//01111=1+2+4+8
		int y = 23;//10111=1+2+4+16
		System.out.println(x^y);
		
		//与运算
		System.out.println(x&y);
		
		//或运算
		System.out.println(x|y);
		
		//左右移运算
	}

}
