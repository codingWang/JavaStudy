package com.duweri.interview;

import java.util.ArrayList;
import java.util.List;

public class FinalTest {
	
	public static void main(String[] args) {
		int a = 10;
		System.out.println((a>>1)+5);
		System.out.println(a>>1);
		System.out.println(a<<1);
		final List<String> list = new ArrayList<>(10);
		System.out.println(list.size());
		for (int i = 0; i < 15; i++) {
			list.add(i+"");
		}
		System.out.println(list.size());
		for (String string : list) {
			System.out.println(string);
		}
	}
	

}
