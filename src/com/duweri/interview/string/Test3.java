package com.duweri.interview.string;

public class Test3 {
	
	String string = "good";//new String("good");
	char[] ch = {'a','b','c'};

	public static void main(String[] args) {
		Test3 test3 = new Test3();
		test3.change(test3.string, test3.ch);
		System.out.println(test3.string);
		System.out.println(test3.ch);
	}
	
	public void change(String str,char ch[]) {
		str = "test ok";
		ch[0] = 'g';
	}
	
	
	

}
