package com.duwei.thinkingjava.innerclass;

public class PrivateInnerClassTest {
	private int x = 10;
	private int[] arr;
	
	public PrivateInnerClassTest(){
		arr = new int[10];
	}
	
	
	private class Inner implements Func{

		@Override
		public int add(int a, int b) {
			return a+b;
		}
		
		public void say(){
			System.out.println("x的值"+x);//访问外部类的私有方法
		}
	}
	

	public static void main(String[] args) {
		
		Inner f = new PrivateInnerClassTest().new Inner();//可以访问私有内部类
		
		System.out.println(f.add(10, 20));
		f.say();

	}

}


interface Func{
	int add(int a ,int b);
	
}