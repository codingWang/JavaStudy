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
		System.out.println("a^b = "+(a^b));
		
		int x = 15;//01111=1+2+4+8
		int y = 23;//10111=1+2+4+16
		System.out.println("x^y = "+(x^y));
		
		//与运算
		System.out.println("x&y = "+(x&y));
		
		//或运算
		System.out.println("x|y = "+ (x|y));
		
		//左右移运算
		System.out.println("8>>2 = "+(8>>2));
		System.out.println("8<<2 = "+(8<<2));
		
		//~		原码01000放进计算机用补码：01000，
		//取反计算：10111（这是补码），输出源码（取反加1，符号位不变）：11001
		System.out.println("~ = "+(~8));
		
		System.out.println("8>>>2="+(8>>>2));
		
	}

}
