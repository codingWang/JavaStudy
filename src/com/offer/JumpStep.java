package com.offer;

import java.util.Scanner;

/**
 * 青蛙跳台阶问题：求斐波那契数列
 * <有一楼梯共m级，刚开始时你在第一级，>
 * <若每次只能跨上一级或二级，要走上第m级，>
 * <共有多少走法？>
 * @author 杜伟
 */

public class JumpStep {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JumpStep m = new JumpStep();
		while(sc.hasNext()) {
			int num = sc.nextInt();
			for(int i=0; i<num; i++) {
				System.out.println(m.Fan(sc.nextInt()));
			}
		}
	
	}
	public int Fan(int n) {
		if(n == 1) return 0;
		if(n == 2) return 1;
		if(n == 3) return 2;
		return Fan(n-1)+Fan(n-2);
	}
}

