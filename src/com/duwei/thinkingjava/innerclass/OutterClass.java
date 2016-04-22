package com.duwei.thinkingjava.innerclass;
/**
 * 访问非静态内部类的方法
 * 访问外部类的属性
 * @author 杜伟
 */
public class OutterClass {
	private String name = "duwei";		//私有变量
	public String sex = "man";			//公有变量
	private static int age = 15;		//静态变量
	
	interface IPrintString{
		String print();
	}

	public String sayOutter()  {		//局部内部类
		class PrintString implements IPrintString{
			@Override
			public String print() {
				return "Outter";
			}
		}
		return new PrintString().print();
	}
	
	public String sayOutter2(){
		return new IPrintString() {		//这是匿名内部类
			@Override
			public String print() {
				return "Outter2";
			}
		}.print();
	}

	class InnerClass {
		//private static String name = "123";//不可以有静态变量
		public void sayInner() {			//访问外部类的私有，共有，静态属性
			System.out.println("inner：name="+name+",sex="+sex+",age = "+age);
			System.out.println(OutterClass.this.sayOutter()+";匿名内部类："
			+OutterClass.this.sayOutter2());//访问外部类的方法
		}
	}

	public static void main(String[] args) {
		OutterClass outter = new OutterClass();
		InnerClass inner = outter.new InnerClass();//内部类对象的初始化方式
		inner.sayInner();
	}
}
