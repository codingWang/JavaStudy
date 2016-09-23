package com.xiaomi;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<String> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextLine());//所有分身放入链表
		}
		//输入完毕
		
		
	}

}
