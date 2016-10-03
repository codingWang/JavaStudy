package com.youku;

public class JAVA_05 {
	private class InterClass{
		public InterClass(){
			System.out.println("i an interclass");
		}
	}
	//¹¹Ôìº¯Êý
	public JAVA_05(){
		InterClass interclass = new InterClass();
		System.out.println("i am JAVA_05");
	}
	public static void main(String[] args) {
		JAVA_05 o = new JAVA_05();
	}

}
