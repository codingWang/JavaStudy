package com.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 给定整形数组，组合出最小值
 * @author 杜伟
 */

public class MinTotalInArr {

	public static void main(String[] args) {
		System.out.println(new MinTotalInArr().PrintMinNumber(new int[]{21,123,6,48}));
	}

	public String PrintMinNumber(int[] numbers) {
		int n = numbers.length;
		String s = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(numbers[i]);
		}
		Collections.sort(list, new Comparator<Integer>() {
			public int compare(Integer str1, Integer str2) {
				String s1 = str1 + "" + str2;
				String s2 = str2 + "" + str1;
				return s1.compareTo(s2);
			}
		});
		for (int j : list) {
			s += j;
		}
		return s;
	}

}
