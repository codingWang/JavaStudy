package com.duwei.multythread;

import java.util.concurrent.locks.ReentrantLock;
/**
 * 有两个线程都对i进行++操作，为了保证线程安全，
 * 使用了 ReentrantLock，从用法上可以看出，
 * 与 synchronized相比， ReentrantLock就稍微复杂一点。
 * 因为必须在finally中进行解锁操作，如果不在 finally解锁，
 * 有可能代码出现异常锁没被释放，而synchronized是由JVM来释放锁。
 * @author 杜伟
 *
 */
public class ReentrantLockDemo implements Runnable{
	public static ReentrantLock lock = new ReentrantLock();
	public static int i = 0;
	@Override
	public void run(){
		for (int j = 0; j < 10000000; j++){
			lock.lock();
			try{
				i++;
			}
			finally{
				lock.unlock();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
		ReentrantLockDemo test = new ReentrantLockDemo();
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(i);
	}

}
