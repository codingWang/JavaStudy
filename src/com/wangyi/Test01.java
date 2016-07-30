package com.wangyi;

public class Test01 {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(Test01.test01(i));
	}
	
	public static int test01(int i){
		try {
			i+=10;
			return i;
		} catch (Exception e) {
			
		}finally{
			i+=10;
			return i;
		}
	}

}
