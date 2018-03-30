package com.duweri.interview.string;
/**
 * 字符串内存分配
 * @author 杜伟
 */
public class StringTest {

	public static void main(String[] args) {
		String s = " Hello ";
		String s1;
		s+=" World ";
		s.trim();
		s1 = s.trim();
		System.out.println(s);
		System.out.println(s1);
	}

}
