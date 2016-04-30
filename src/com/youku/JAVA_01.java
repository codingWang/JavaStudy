package com.youku;

public class JAVA_01 {
	
	public static void main(String[] args) {
		A classa = new A("he");
		A classb = new A("he");
		System.out.println(classa==classb);
	}
}

class A{
	public A(String str){}
}
