package com.duwei.multythread;
/**
 * 调用Thread.start&&Thread.run的区别！！！
 * @author 杜伟
 */
public class ThreadDemo {

	public static void main(String[] args) {
//		Thread thread = new Thread("t1"){
//			@Override
//			public void run(){
//				System.out.println(Thread.currentThread().getName());
//			}
//		};
//		thread.start();
//----------------------------------------
		Thread thread = new Thread("t1"){
			@Override
			public void run(){
				System.out.println(Thread.currentThread().getName());
			}
		};
		thread.run();
	}

}
