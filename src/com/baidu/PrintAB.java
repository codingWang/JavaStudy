package com.baidu;

public class PrintAB {
	public static void main(String[] args) {
		new PrintAB().printAB();
	}
	
	/**
	 * 这个解法自己想的有点弱智了！
	 */
//	public void printAB(){
//		if(new PrintAB(){
//			boolean www(){
//				System.out.print("a");
//				return false;
//			}
//		}.www()){
//			System.out.print("a");
//		}else{
//			System.out.print("b");
//		}
//	}
	
	/**
	 * 借鉴的解法
	 */
	public void printAB(){
		if(System.out.append("a")==null){
			System.out.print("a");
		}else{
			System.out.print("b");
		}
	}
	

}
