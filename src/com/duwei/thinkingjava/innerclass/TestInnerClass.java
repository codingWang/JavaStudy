package com.duwei.thinkingjava.innerclass;

import com.duwei.thinkingjava.reflect.This;

public class TestInnerClass {
	
	private Inner inner = this.new Inner();//û
	
	public void loadInner(){
		inner = new Inner();
	}
	
	class Inner{
		public void say(){
			System.out.println("say");
		}
	}
	
	public static void main(String[] args) {
		
		
	}
}
