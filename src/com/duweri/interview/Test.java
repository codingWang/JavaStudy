package com.duweri.interview;

public class Test {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		
//		int[][] arr = new int[3][4];
//		
//		System.out.println(arr.length);
//		
//
//	}
	
	
	
	private static final String MESSAGE="taobao";
	  public static void main(String [] args) {
	    String a ="tao"+"bao";//在池中创建tao和bao，并指向“taobao”对象
	    String b="tao";//指向池中的tao
	    String c="bao";//指向池中的bao
	    String d = b+c;//堆中创建d
	    System.out.println(a==MESSAGE);
	    System.out.println("-------------");
	    System.out.println((b+c)==MESSAGE);//对象
	    
	    System.out.println(d.hashCode()+"+"+MESSAGE.hashCode());
	    System.out.println((b+c).length()+"+"+MESSAGE.length());
	  }

}
