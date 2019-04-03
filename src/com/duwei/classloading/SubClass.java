package com.duwei.classloading;

public class SubClass extends SuperClass {

	static {
		System.out.println("SubClass 初始化了");
	}

}
