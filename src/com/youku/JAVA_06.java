package com.youku;
/**
 * 静态变量所有的实例共享
 * @author 杜伟
 */
public class JAVA_06 {
	
	private static int x = 100;
	
	public static void main(String[] args) {
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
