package com.duwei.thinkingjava.reflect;

public class Other extends OtherFather{
	
	static final int AGE = 24;
	
	static {
		System.out.println("5-->Other被初始化了");
	}
	
	Other(){
		System.out.println("7-->Other构造函数");
	}

}
