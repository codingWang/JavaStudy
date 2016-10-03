package com.youku;

import java.util.HashMap;
/**
 * 使用==运算符判断对象是否相等
 * @author 杜伟
 *
 */
public class JAVA_01 {
	
	public static void main(String[] args) {
		A classa = new A("he");
		A classb = new A("he");
		System.out.println(classa == classb);//false
		System.out.println(classa.equals(classb));//false
	}
}
class A{
	public A(String str){}
	
	@Override
	public boolean equals(Object obj) {
		return this.hashCode()==obj.hashCode();//false,自定义equals方法
		//return super.equals(obj);// 父类：return (this == obj);
	}
}
