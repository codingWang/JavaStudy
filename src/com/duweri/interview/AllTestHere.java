package com.duweri.interview;

public class AllTestHere {

	public static void main(String[] args) {
		//AllTestHere.test1();
		AllTestHere.test2();
	}
	
	
	public static void test1(){
		boolean b = true;
		if (b) {
		}
		for (int i = 0;; i=3) {
			System.out.println(i);
			//return;
		}
	}
	
	public static void test2(){
		int i = 0;
		Integer integer = new Integer(0);
		
		System.out.println(i == integer);
		System.out.println(integer.equals(i));
	}

}
