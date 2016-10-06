package com.sogou;

public class HelloSogou {
	
	public static synchronized void main(String[] a) {
		Thread t = new Thread() {
			@Override
			public void run() {
				Sogou();
			}
		};
		t.start();
//		t.run(); // t.start();
		
//		try {
//			Thread.sleep(1500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.print("Hello");
		
	}

	static synchronized void Sogou() {
		System.out.print("Sogou");
	}
}
