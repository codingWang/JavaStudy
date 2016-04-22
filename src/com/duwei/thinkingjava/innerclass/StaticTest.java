package com.duwei.thinkingjava.innerclass;

public class StaticTest {

	public static void main(String[] args) {
		String str = "I come from China.";
		
		String[] after = str.split(" ");
		for (int i = after.length-1; i >=0; i--) {
			System.out.println(after[i]);
		}
	}
}
