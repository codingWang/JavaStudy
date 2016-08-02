package com.wangyi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02 {
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Map<String, Integer> map = new HashMap<>();;
		
		while(scanner.hasNextLine()){
			//System.out.println(scanner.next());
			String nextString = scanner.next();
			if (map.containsKey(nextString)) {
				//Integer integer = map.get(nextString);
				//map.put(nextString, integer++);
			}else{
				map.put(nextString, 1);
			}
			
			
			
		}
		System.out.println(map.size());
		
		
	}


}
