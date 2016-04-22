package com.duwei.thinkingjava.reflect;

public class This {
	static Other other;//引用
	static{
		System.out.println("1-->This被初始化了");//1
	}
	This(){
		System.out.println("3-->This的构造函数");//3
	}
	public static void main(String[] args) {
		System.out.println("2-->main被执行了");//2
		This ths = new This();
		//System.out.println(Other.AGE);//不需要初始化类而调用类的变量-->编译期常量
		
		//Class clazz = Other.class;//不会进行初始化
		//Class clazz = Class.forName("com.duwei.thinkingjava.reflect.Other");//将进行初始化
		other = new Other();//用到某个类的时候才去加载某个类
	}
}
