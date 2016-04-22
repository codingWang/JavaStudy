package com.duwei.designpattern.chapter2_001;

import java.util.HashMap;
import java.util.Map;

public class Chapter2_001 {
	
	public static void invoker(){
//		Father f = new Father();
//		HashMap map = new HashMap();
//		f.doSomething(map);
		
		Son s = new Son();
		HashMap map = new HashMap();
		s.doSomething(map);
	}

	public static void main(String[] args) {
		invoker();
	}

}
