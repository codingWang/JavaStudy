package com.toutiao;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();//n个数字
		int m = scanner.nextInt();//m
		int total=0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}
		//TODO:两两亦或放入list2
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			for (int j = 1; j < list.size(); j++) {
				if (i<j) {
					list2.add(list.get(i)^list.get(j));
				}
			}
		}
		
		for (int i = 0; i < list2.size(); i++) {
			if(list2.get(i) > m){
				total++;
			}
		}
		System.out.println(total);
	}

}
