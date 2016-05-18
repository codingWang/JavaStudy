package com.duweri.interview;

import java.util.ArrayList;
import java.util.List;

public class SubStringTest {
	public static void main(String[] args) {
		SubStringTest.out();
	}

	public static void out() {
		String str = "我爱你们,你爱他,他爱她们加一,她爱他";
		String temp = str + ",";
		List<String> list = new ArrayList<>();
		while (true) {
			String splitStr = null; // 保留截取的字符串
			int index = temp.indexOf(",");
			if (index < 0) {
				break;
			}
			splitStr = temp.substring(0, index);
			//System.out.println(splitStr);
			list.add(splitStr);
			temp = temp.substring(index + 1);
		}
	}
}
