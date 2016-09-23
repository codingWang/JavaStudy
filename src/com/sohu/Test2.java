package com.sohu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//List<Character> list = Arrays.asList('A','B','C','D','E');
		List<Character> list = new ArrayList<Character>();
		list.add('A');list.add('B');list.add('C');list.add('D');list.add('E');
		//while(scanner.hasNextLine()){
			String string = scanner.nextLine();
			char[] chars = string.toCharArray();
			int start = 0,stop=0;
			for (int i = 0; i < chars.length; i++) {
				for (int j = 0; j < list.size(); j++) {
					if (chars[i] == list.get(j) && list.size()==5) {//相等
						start = i;
						list.remove(list.get(j));//已经找到，移除
						break;
					}
					if (chars[i] == list.get(j)) {
						list.remove(list.get(j));//已经找到，移除
						break;
					}
					if (chars[i] == list.get(j) && list.size()==1) {//相等
						stop = i;
						list.remove(list.get(j));//已经找到，移除
						break;
					}
				}
			}
			System.out.println(chars.length-stop+start);
		//}
		
	}

}
