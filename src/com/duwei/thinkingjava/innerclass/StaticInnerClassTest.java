package com.duwei.thinkingjava.innerclass;
/**
 * 静态内部类
 * @author 杜伟
 */
public class StaticInnerClassTest {
	private String name = "StaticInnerClassTest";
	private static String name2 = "StaticInnerClassTest2";
	
	interface InnerClassInterface{	//接口里面定义类
		void print();
		class TestInnerClassInterface implements InnerClassInterface{//接口里面的类可以实现该接口
			@Override
			public void print() {
				System.out.println("InnerClassInterface");
			}
		}
	}
	
	static class InnerClass{
		private static String name = "innerclass";
		private int age = 25;
		public void say(){
			System.out.println("inner="+name);
			System.out.println("age="+age);
			//System.out.println(StaticInnerClassTest.this.name);//内部类先加载了，外部类不可达
		}
	}

	public static void main(String[] args) {
		InnerClass inner = new InnerClass();
		inner.say();
		System.out.println(inner.name);
		new StaticInnerClassTest.InnerClassInterface.TestInnerClassInterface().print();
	}

}
