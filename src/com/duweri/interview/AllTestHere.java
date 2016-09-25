package com.duweri.interview;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class AllTestHere {

	public static void main(String[] args) {
		// AllTestHere.test1();
		 AllTestHere.test2();
//		AllTestHere.test3();
//		System.out.println(AllTestHere.test4());
//		AllTestHere.test5();
	}

	public static void test1() {
		boolean b = true;
		if (b) {
		}
		for (int i = 0;; i = 3) {
			System.out.println(i);
			// return;
		}
	}
	/**
	 * int & Integer的比较
	 */
	public static void test2() {
		int i = 0;
		Integer integer = new Integer(0);

		System.out.println(i == integer);//true
		System.out.println(integer.equals(i));//true
	}
	/**
	 * Collection相关方法
	 */
	public static void test3() {
		int array[] = { 112, 111, 23, 456, 231 };
		// double[] arr = {};
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {
			list.add(new Integer(array[i]));
		}
		// -------------排序-----------------------
		Collections.sort(list);
		for (int i = 0; i < array.length; i++) {
			System.out.print(list.get(i) + ",");
		}
		System.out.println();
		// ---------------混排----------------------
		System.out.println("-----混排--------");
		Collections.shuffle(list);
		for (int i = 0; i < array.length; i++) {
			System.out.print(list.get(i) + ",");
		}
		System.out.println();
		// -----------------反转--------------------
		System.out.println("-----反转-------");
		Collections.reverse(list);
		for (int i = 0; i < array.length; i++) {
			System.out.print(list.get(i) + ",");
		}
		System.out.println();
		// -----------------最小值--------------------
		System.out.println("-----------最小值---------");
		Collections.min(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ",");
		}
		System.out.println();
		// -----------------最大--------------------
		System.out.println("-------最大------");
		Collections.max(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ",");
		}
		
		System.out.println();
		// -----------------替换--------------------
		System.out.println("-------替换------");
		Collections.fill(list, 111);
		for (int i = 0; i < array.length; i++) {
			System.out.print(list.get(i) + ",");
		}
		
	}
	/**
	 * 日期格式化
	 */
	public static String test4(){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date curDate = new Date(System.currentTimeMillis());// 获取当前时间
        return formatter.format(curDate);
	}

	public static void test5(){
		Boolean flag = false;
		if (flag = true){//这里是赋值不是==
		    System.out.println("true");
		}
		else{
		    System.out.println("false");
		}
	}

}
