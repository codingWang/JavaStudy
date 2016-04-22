package com.alibaba;

import java.util.Scanner;


public class Banker{
	int available[] = new int[]{3,3,2};//可得到的资源
	int max[][] = new int[][]{{7,5,3},{3,2,2},{9,0,2},{2,2,2},{4,3,3}};//每个进程最大资源数
	int allocation[][] = new int[][]{{0,1,0},{2,0,0},{3,0,2},{2,1,1},{0,0,2}};//每个进程目前拥有的资源数
	int need[][] = new int[][]{{7,4,3},{1,2,2},{6,0,0},{0,1,1},{4,3,1}};//每个进程需要的资源数
	
	void showData()//展示数据输出每个进程的相关数据
	{
		System.out.println("进程号      Max   Allocation Need   ");
		System.out.println("     A  B  C  A  B  C  A  B  C");
		for(int i = 0;i<5;i++)
		{
			System.out.print(i+"    ");
			for(int m = 0;m<3;m++) System.out.print(max[i][m]+"  ");
			for(int m = 0;m<3;m++) System.out.print(allocation[i][m]+"  ");
			for(int m = 0;m<3;m++) System.out.print(need[i][m]+"  ");
			System.out.println();
		}
	}

	boolean change(int inRequestNum,int inRequest[]){//分配数据
		int requestNum = inRequestNum;
		int request[] = inRequest;
		// for(int i=0;i<3;i++)System.out.println("修改前available"+available[i]);
		if(!(request[0]<=need[requestNum][0]&&request[1]<=need[requestNum][1]&&request[2]<=need[requestNum][2])){
			System.out.println("请求的资源数超过了所需要的最大值，分配错误");
			return false;
		}
		if((request[0]<=available[0]&&request[1]<=available[1]&&request[2]<=available[2])==false){
			System.out.println("尚无足够资源分配，必须等待");
			return false;
		}
		for(int i = 0;i<3;i++){//试分配数据给请求的线程
	
			available[i] = available[i]-request[i];
			
			allocation[requestNum][i] = allocation[requestNum][i] + request[i];
			
			need[requestNum][i] = need[requestNum][i] - request[i];
	
		}
		boolean flag = checkSafe(available[0],available[1],available[2]);//进行安全性检查并返回是否安全
		
		if(flag==true){
			System.out.println("能够安全分配");
			return true;
		}else{	
			System.out.println("不能够安全分配");		
			for(int i = 0;i<3;i++){		
				available[i] = available[i]+request[i];			
				allocation[requestNum][i] = allocation[requestNum][i] - request[i];
				need[requestNum][i] = need[requestNum][i] + request[i];
			}	
			return false;	
		}
	
	}
	
	boolean checkSafe(int a,int b,int c){
		int work[] = new int[3];
		work[0] = a;
		work[1] = b;
		work[2] = c;
		int i=0;
		boolean finish[] =  new boolean[5];
		while(i<5)//寻找一个能够满足的认为完成后才去执行下一进程
		{
			if(finish[i]==false&&need[i][0]<=work[0]&&need[i][1]<=work[1]&&need[i][2]<=work[2]){//找到满足的修改work值，然后i=0，重新从开始的为分配的中寻找
				System.out.println("分配成功的是"+i);
			for(int m = 0;m<3;m++)
				work[m] =work[m] + allocation[i][m];
			finish[i] = true;
			i=0;
			}else//如果没有找到直接i++
				i++;
			}
	
	for(i=0;i<5;i++){
	
		if(finish[i]==false)
	
			return false;
	
		}
	
		return true;
	
	}
	
	public static void main(String[] args)
	
	{
	
	Banker bank = new Banker();
	
	bank.showData();
	
	int request[] =new int[3];
	
	int requestNum;
	
	String source[] = new String[]{"A","B","C"};
	
	Scanner s = new Scanner(System.in);
	
	String choice = new String();
	
	while(true)//循环进行分配
	
	{
	
	System.out.println("请输入要请求的进程号（0--4）：");
	
	requestNum = s.nextInt();
	
	System.out.print("请输入请求的资源数目");
	
	for(int i = 0;i<3;i++)
	
	{
	
	System.out.println(source[i]+"资源的数目：");
	
	request[i] = s.nextInt();
	
	}
	
	bank.change(requestNum, request);
	
	System.out.println("是否再请求分配(y/n)");
	
	choice = s.next();
	
	if(choice.equals("n"))
	
	break;
	
	}
	
	}
	
	}