package com.duweri.interview.datastructure;

import javax.management.Descriptor;

public class Sort {

	public static void main(String[] args) {
		int[] testArr = {12,27,19,39,16,49,61,40,20,94,63,13,27,31,38,43,11,44,81,29,33,88,60,80,51,4,0,1,22,9,8};
		Sort.insertSort(testArr);
//		Sort.bubbleSort(testArr);
//		Sort.quickSort(testArr, 0, testArr.length-1);
//		Sort.selectSort(testArr);
		Sort.display(testArr);
	}
	
 public static void display(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
	
	/**
	 * 插入排序
	 * 关键：1、临时变量保存待排序的数字
	 * 		2、边比较边后移
	 * 适用情况：序列基本有序的时候
	 */
	public static void insertSort(int[] arr){
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];//临时保存待插入序列
			int j;//下面先保证J大于0再去访问arr[j]!!!!
			for (j = i-1;j >= 0 && temp > arr[j]; j--) {//带插入序列大于当前序列就前移--》从大到小排列
				arr[j+1] = arr[j];
			}
			arr[j+1]=temp;
		}
	}
	/**
	 * 希尔排序
	 */
	public static void shellSort(int[] arr){
		
		for (int i = arr.length/2; i >= 1; i=i/2) {//子序列的划分
			
		}
		
	}
	/**
	 * 冒泡排序
	 * 关键：1、外循环标识无序区和有序区
	 * 		2、内循环每次将一个无序区的（最大）数字排到最前面
	 */
	public static void bubbleSort(int[] arr){
		for (int i = 0; i <arr.length-1; i++) {//从后往前推小的
			for (int j = arr.length-1; j>i; j--) {//从最后一个开始遍历
				if (arr[j]>arr[j-1]) {
					int temp = arr[j];//swap
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	
	/**
	 * 快速排序
	 * 关键: 1、选轴值
	 * 		2、一次划分
	 * 		3、递归快排
	 */
	public static void quickSort(int[] arr,int start,int end){
		if(start<end){
			int middle = partition(arr, start, end);
			quickSort(arr, start, middle-1);
			quickSort(arr, middle+1, end);
		}
	}
	/**
	 * 以arr[0]为基准进行一次划分算法，左边都小于arr[0]，右边都大于arr[0]
	 */
	private static int partition(int[] arr,int first,int end){
		while(first < end){
			//先扫描右端
			while(first < end && arr[first]<arr[end]){
				end--;
			}
			if(first < end){
				int temp = arr[end];
				arr[end] = arr[first];
				arr[first] = temp;
				first++;
			}
			//扫描左边
			while(first < end && arr[first]<arr[end]){
				first++;
			}
			if(first<end){
				int temp = arr[end];
				arr[end] = arr[first];
				arr[first] = temp;
				end--; 
			}
		}
		return first;
	}
	
	private static int partition2(int[] arr,int left,int right){
		int pivotKey = arr[left];
		int pivotePointer = left;
		
		while(left < right){
			while(left<right&&arr[right]>=pivotKey){
				right--;
			}
			while(left<right && arr[left]<=pivotKey){
				left++;
			}
//			swap(arr,left,right);
		}
//		swap(arr,pivotePointer,left);
		return left;
	}
	
	
	/**
	 * 选择排序：			O（n^2）
	 * 每次遍历无序区选出最小的
	 */
	public static void selectSort(int[] arr){
		int minIndex = 0;
		for (int i = 0; i < arr.length-1; i++) {
			minIndex = i;//指向最小的值的角标
			for (int j = i+1; j < arr.length; j++) {//遍历无序区
				if(arr[j] < arr[minIndex]){
					minIndex = j;
				}
			}
			if (minIndex != i) {		//无序区遍历完了，找到最小的角标了，交换
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
}
















