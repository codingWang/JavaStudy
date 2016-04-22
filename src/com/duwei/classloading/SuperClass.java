package com.duwei.classloading;

public class SuperClass {
	static{
		System.out.println("SuperClass被初始化了");
	}
	public static int value = 123;
}
