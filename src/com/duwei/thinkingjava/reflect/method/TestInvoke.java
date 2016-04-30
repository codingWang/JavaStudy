package com.duwei.thinkingjava.reflect.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestInvoke {
	
	public void work(){
		System.out.println("没有参数=");
	} 
	public TestInvoke work(String a,Integer b){
		System.out.println("两个参数="+a+b);
		return this;
	}
	public void work(int b){
		System.out.println("一个参数="+b);
	}

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException {
		Class clazz = TestInvoke.class;
		
		Method noParam = clazz.getMethod("work", new Class[]{});
		Method twoParam = clazz.getMethod("work", new Class[]{String.class,Integer.class});
		Method threeParam = clazz.getMethod("work", new Class[]{int.class});
		
		
		noParam.invoke(clazz.newInstance(), new Object[]{});
		twoParam.invoke(clazz.newInstance(), new Object[]{"wdw",new Integer(10)});
		threeParam.invoke(clazz.newInstance(), new Object[]{new Integer(10)});
	}

}
