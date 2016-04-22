package com.duwei.thinkingjava.generictype;

import java.util.ArrayList;
import java.util.Arrays;

public class Erased {

	public static void main(String[] args) {
		Class clazz0 = null;
		try {
			clazz0 =Class.forName("com.duwei.thinkingjava.generictype.Erased");//必须使用完整的报名
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(clazz0.getName());//com.duwei.thinkingjava.generictype.Erased
		
		Class clazz1 = new ArrayList<Integer>().getClass();
		Class clazz2 = new ArrayList<String>().getClass();
		
		System.out.println(clazz1 == clazz2);//true
		System.out.println(clazz1.equals(clazz2));//true
		
		System.out.println(Arrays.toString(new ArrayList<Integer>().getClass().getTypeParameters()));
		
		Integer inte = new Integer(3);
		System.out.println(inte.getClass().getName());//java.lang.Integer
		
	}

}
