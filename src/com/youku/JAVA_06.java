package com.youku;

public class JAVA_06 {
	
	private static int x = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JAVA_06 j = new JAVA_06();
		j.x++;
		JAVA_06 j2 = new JAVA_06();
		j2.x++;
		
		j = new JAVA_06();
		j.x++;
		JAVA_06.x--;
		System.out.println("x="+x);
	}

}
