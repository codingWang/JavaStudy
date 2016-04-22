package com.alibaba;

public class Test_1 {

	public static void main(String[] args) {
		Test_1 t = new Test_1();
		t.first();
	}

	private void first() {
		int i = 5;
		Value v = new Value();
		v.i=25;
		second(v,i);
		System.out.print("-"+v.i);//
	}

	private void second(Value v ,int i) {//25,5
		i = 0;
		v.i=20;
		Value val = new Value();
		v = val;
		System.out.print(v.i+"-"+i);//15,0
	}
	
	public class Value {
		public int i = 15;
	}

}


