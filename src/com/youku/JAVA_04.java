package com.youku;
/**
 * 静态代码块的初始化
 * @author 杜伟
 */
public class JAVA_04 {
	static int x = 10;
	static{
		x+=5;
	}
	public static void main(String[] args) {
		System.out.println("x="+x);
	}
	static{
		x/=3;
	}
}
