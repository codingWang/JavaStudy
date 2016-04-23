package com.alibaba;

public class Test_2 {
	
	public static void main(String[] args){
		int i = 3000;
		Integer j = new Integer(3000);
		
		System.out.println(i == j);
		//自动拆箱
		
		System.out.println(j.equals(i));
		//自动装箱
		//Integer的equals方法比较的是值不是地址
		//String,Integer,Date在这些类当中equals有其自身的实现，而不再是比较类在堆内存中的存放地址了。
	}

}
