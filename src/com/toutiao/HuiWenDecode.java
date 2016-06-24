package com.toutiao;

import java.util.Scanner;

/**
 * 回文解码
 * @author 杜伟
 */
public class HuiWenDecode {

	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		String _string = input.nextLine();
		int a = input.nextInt();
		for (int i = 0; i < a; i++) {//执行a次操作，每次2个数字
			int s1 = input.nextInt();
			int s2 = input.nextInt();
			_string = getString(_string, s1, s2);
		}
		System.out.println(_string);
	}

	public static String getString(String inString, int a, int b) {
		String _part = inString.substring(a, a + b);
		StringBuilder _part2 = new StringBuilder(_part);
		String part3 = _part2.reverse().toString();
		return inString.substring(0, a + b) + part3 + inString.substring(a + b);
	}

}
