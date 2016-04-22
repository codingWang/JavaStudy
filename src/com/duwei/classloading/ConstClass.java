package com.duwei.classloading;

public class ConstClass {
	static {
		System.out.println("Const 被初始化了");
	}
	//常量在编译阶段会调入类的常量池中，本质上并没有直接引用到定义常量的类中，因此不会触发定义常量的类的初始化
	public static final String HELLO_WORD = "hello word";
}
