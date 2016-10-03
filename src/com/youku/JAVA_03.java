package com.youku;
/**
 * 代码块。静态代码块，构造函数，父类子类的初始化过程
 * @author 杜伟
 */
public class JAVA_03 extends HelloA {

	public JAVA_03() {
		System.out.println("JAVA_03构造函数");
	}
	//代码块
	{
		System.out.println("JAVA_03代码块");
	}
	//静态代码快
	static {
		System.out.println("JAVA_03静态代码块");
	}

	public static void main(String[] args) {
		new JAVA_03();
	}

}

class HelloA {
	public HelloA() {
		System.out.println("A构造函数");
	}

	{
		System.out.println("A的代码块");
	}

	static {
		System.out.println("A的静态代码块");
	}

}
