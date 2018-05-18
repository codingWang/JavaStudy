package com.duwei.multythread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {

	public static void main(String[] args) {
		AtomicInteger ai = new AtomicInteger(0);
		int i1 = ai.get();//取值0
		v(i1);
		int i2 = ai.getAndSet(5);//先取值再设值0
		v(i2);
		int i3 = ai.get();//取值5
		v(i3);
		int i4 = ai.getAndIncrement();//取值再加5
		v(i4);
		v(ai.get());//取值6
	}

	static void v(int i) {
		System.out.println("i : " + i);
	}

}
