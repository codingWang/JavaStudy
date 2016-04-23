package com.youku;

public class JAVA_03 extends HelloA{
	
	
	public JAVA_03(){
		System.out.println("JAVA_03");
	}
	
	{
		System.out.println("I am JAVA_03 class");
	}
	
	static{
		System.out.println("static JAVA_03");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JAVA_03();
	}

}



class HelloA{
	public HelloA(){
		System.out.println("HelloA");
		
	}
	
	{
		System.out.println("I am A class");
	}
	 static{
		 System.out.println("static A");
	 }
	
}
