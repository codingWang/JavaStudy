package com.duweri.interview.datastructure;

public class BinSearch {
	public static void main(String[] args) {
	}
	
	private static int binSearch(int[] r,int n,int k){
		int low = 1;
		int high = n;
		while(low <= high){
			int mid = (low+high)/2;
			if (r[mid] > k) {
				high = mid - 1;
			}else if (r[mid] < k) {
				low = mid+1;
			}else{
				return mid;
			}
		}
		return 0;
	}
	
	

}
