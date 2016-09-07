package com.duweri.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueNum {
	public static void main(String[] args) {
		
	}
	
	
	public boolean containsNum(int num){
		Integer arr[] = {1,2,3,4,5,6,7,8,9,0,1};
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list.size());
		System.out.println(list.contains(2));
		for (int i = 0,length = list.size(); i < length; i++) {
			//System.out.println(list.get(i));
			if (list.contains(num)) {
				return true;
			}
		}
		return false;
	}

}
