package com.duweri.interview;

import javax.management.Descriptor;

public class Sort {

	public static void main(String[] args) {
		int[] testArr = {1,7,3,0,4,8,3,6,2,5,9};
		Sort.insertSort(testArr);
		Sort.display(testArr);
	}
	public static void display(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
	
	/**
	 * 插入排序
	 * {@link Descriptor}先用i指向待插入数，j往前查找同时后移
	 * 适用情况：序列基本有序的时候
	 */
	public static void insertSort(int[] arr){
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];//临时保存待插入序列
			int j;//下面先保证J大于0再去访问arr[j]!!!!
			for (j = i-1;j >= 0 && temp > arr[j]    ; j--) {//带插入序列大于当前序列就前移--》从大到小排列
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
	 */
	public static void bubbleSort(int[] arr){
		
	}
	

}
