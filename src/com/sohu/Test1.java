package com.sohu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();//
		int much = scanner.nextInt();//
		char[] numChar = (num + "").toCharArray();
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < numChar.length; i++) {
			list.add(Integer.parseInt(numChar[i]+""));
			list2.add(Integer.parseInt(numChar[i]+""));//保存元素局
		}
		Collections.sort(list);
		for (int i = 0; i < much; i++) {//移除前much个元素
			list2.remove(list.get(i));
//			i++;
//			much--;
		}
//		System.out.println(list2.toString());
		String returnString = "";
		for (int i = 0; i < list2.size(); i++) {
			returnString += list2.get(i);
		}
		System.out.println(returnString);
	}

}
