package com.duwei.multythread.lock;

import java.util.concurrent.locks.ReentrantLock;
/**
 * �������̶߳���i����++������Ϊ�˱�֤�̰߳�ȫ��
 * ʹ���� ReentrantLock�����÷��Ͽ��Կ�����
 * �� synchronized��ȣ� ReentrantLock����΢����һ�㡣
 * ��Ϊ������finally�н��н���������������� finally������
 * �п��ܴ�������쳣��û���ͷţ���synchronized����JVM���ͷ�����
 * @author ��ΰ
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
