package com.duwei.designpattern.chapter2_001;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Son extends Father{

	public Collection doSomething(Map map){
		System.out.println("всюЮ");
		return map.values();
	}

	@Override
	public Collection doSomething(HashMap map) {
		return super.doSomething(map);
	}
	
	
}
