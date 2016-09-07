package com.duweri.interview;
/**
 * 重载和重写
 * @author 杜伟
 */
public class OverloadVsOverride {
	
	public boolean equals(OverloadVsOverride other){
		System.out.println("equals");
		return true;
	}

	public static void main(String[] args) {
		Object o1 = new OverloadVsOverride();
		Object o2 = new OverloadVsOverride();
		
		OverloadVsOverride o3 = new OverloadVsOverride();
		OverloadVsOverride o4 = new OverloadVsOverride();
		if (o1.equals(o2)) {//o1,o2不相等
			System.out.println("o1 equals o2");
		}
		if (o3.equals(o4)) {//O3，O4相等
			System.out.println("o3 equals o4");
		}
	}

}
