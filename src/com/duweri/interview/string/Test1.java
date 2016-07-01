package com.duweri.interview.string;

public class Test1 {

	public static void main(String[] args) {
		
		String s1="abc"+"def";//1		³Ø
		String s2=new String(s1);//2	¶Ñ
		if(s1.equals(s2))//3			
			System.out.println(".equals succeeded");//4
		if(s1==s2)//5					X
			System.out.println("==succeeded");//6

	}

}
