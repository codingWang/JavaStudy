package com.duwei.multythread;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FileSearch2 implements Callable<List<File>> {
	static ExecutorService service = Executors.newCachedThreadPool();// 线程池
	private File directory;
	private FilenameFilter filter;

	public FileSearch2(File directory, FilenameFilter filter) {
		super();
		this.directory = directory;
		this.filter = filter;
	}

	public static void main(String[] args) throws Exception {
		File dir = new File("D:\\Usersworkspace\\JavaStudy");// 指定搜索目录
		FileSearch search2 = new FileSearch(dir, new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");// 所有以java结尾的文件
			}
		});
		FutureTask<List<File>> task = new FutureTask<>(search2);

		service.submit(task);

		for (File f : task.get()) {// 这里会堵塞线程
			System.out.println(f.getPath());
		}
		service.shutdown(); // 完成后结束线程池

	}

	@Override
	public List<File> call() throws Exception {
		System.out.println("线程" + Thread.currentThread().getName());
		List<File> list = new ArrayList<File>();// 文件
		File[] files = directory.listFiles();

		ArrayList<Future<List<File>>> results = new ArrayList<Future<List<File>>>();// 装满了任务
		for (File f : files) {
			if (f.isDirectory()) {// 这是一个目录
				Callable<List<File>> runnable = new FileSearch(f, filter);// 有返回值的任务
				FutureTask<List<File>> task = new FutureTask<List<File>>(
						runnable);
				results.add(task);
				service.submit(task);
			} else if (filter.accept(f.getParentFile(), f.getName())) {
				list.add(f);
			}
		}
		for (Future<List<File>> result : results) {
			list.addAll(result.get());
		}
		return list;
	}

}
