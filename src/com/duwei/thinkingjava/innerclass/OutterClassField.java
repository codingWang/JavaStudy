package com.duwei.thinkingjava.innerclass;
/**
 * 内部类访问外部类的属性
 * @author 杜伟
 */
public class OutterClassField {
	
	private String name = "duwei";
	public String sex = "nan";

	
	class Chinese{
		
		public void say(){
			//内部类访问外部类的私有属性
			System.out.println("内部类访问外部类的私有属性"+new OutterClassField().name);
			System.out.println("内部类访问外部类的公有属性"+new OutterClassField().sex);
			
		}
		
	}
	
	public static void main(String[] args) {
		new	OutterClassField().new Chinese().say();

	}

}
