package com.duwei.classloading;


public class Test {

	public static void main(String[] args) {
		//1.new一个类的数组时这个类不会被初始化
//		SuperClass[] a = new SuperClass[12];
//		System.out.println("1");
		
		//2、编译期常量，类不会被初始化
//		System.out.println(ConstClass.HELLO_WORD);
		
		//3、通过子类来引用父类的静态字段只会触发父类的初始化
//		System.out.println(SubClass.value);
		
		
		System.out.println(StaticTest.i);
		//System.out.println(StaticTest.x);
		
	}

}
