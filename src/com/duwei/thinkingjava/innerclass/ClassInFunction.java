package com.duwei.thinkingjava.innerclass;

public class ClassInFunction {
	
	//类里面放interface
	interface Destination{
		String readLabel();
	}
	
	//方法里面有个类
	public Destination destination(String s){
		
		class pDestination implements Destination{

			private String label;
			
			private pDestination(String whereTo){
				label = whereTo;
			}
			
			@Override
			public String readLabel() {
				return label;
			}

			@Override
			public String toString() {
				return "pDestination [label=" + label + "]";
			}
			
		}
		return new pDestination(s);
	}

	public static void main(String[] args) {
		ClassInFunction p = new ClassInFunction();
		System.out.println(p.destination("123").toString());
		Destination d = p.destination("123");
		
	}

}

