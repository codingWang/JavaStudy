package com.duwei.multythread;

import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
 
public class FileSearch implements Callable<List<File>> {
    private File directory;
    private FilenameFilter filter;
    public FileSearch(File directory, FilenameFilter filter) {
        super();
        this.directory = directory;
        this.filter = filter;
    }
    
    public static void main(String[] args) throws Exception {
        File dir = new File("D:\\Usersworkspace\\JavaStudy");//指定搜索目录
        FileSearch search = new FileSearch(dir, new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");//所有以java结尾的文件
            }
        });
        
        FutureTask<List<File>> task = new FutureTask<List<File>>(search);//search实现了Callable接口，封装到任务当中
        
        Thread t = new Thread(task);	//任务传入线程
        t.start();						//开启
        for (File f : task.get()) {
            System.out.println(f.getPath());
        }
    }
    
    @Override
    public List<File> call() throws Exception {//实现Callable接口，有返回值的任务线程
    	//System.out.println("call 开始"+Thread.currentThread().getName());
    	
        List<File> list = new ArrayList<File>();//文件
        File[] files = directory.listFiles();
        
        ArrayList<Future<List<File>>> results = new ArrayList<Future<List<File>>>();//装满了任务
        for (File f : files) {
            if (f.isDirectory()) {//这是一个目录
                Callable<List<File>> runnable = new FileSearch(f, filter);//有返回值的任务
                FutureTask<List<File>> task = new FutureTask<List<File>>(runnable);
                results.add(task);
                Thread t = new Thread(task);
                t.start();
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

