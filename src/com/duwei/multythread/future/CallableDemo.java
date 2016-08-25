package com.duwei.multythread.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();//线程池
		
		Task task = new Task();//任务
		Future<Integer> result = executorService.submit(task);//提交任务，返回一个Future
		//Future就是对于具体的Runnable或者Callable任务的执行结果进行取消、
		//查询是否完成、获取结果。必要时可以通过get方法获取执行结果，该方法会阻塞直到任务返回结果。
		
		executorService.shutdown();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.err.println("主线程在执行");
		
		try {
			System.out.println("task运行结果"+result.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("所有任务执行完毕");
	}
	

}


class Task implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {//有结果返回的，执行耗时计算任务
		System.out.println("子线程在进行中");
		Thread.sleep(3000);
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum +=i;
		}
		return sum;
	}
	
}
