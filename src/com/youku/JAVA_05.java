package com.youku;

public class JAVA_05 {
	
	//内部类
	private class InterClass{
		//构造函数
		public InterClass(){
			System.out.println("i an interclass");
		}
	}
	//构造函数
	public JAVA_05(){
		InterClass interclass = new InterClass();
		System.out.println("i am JAVA_05");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JAVA_05 o = new JAVA_05();
	}

}
