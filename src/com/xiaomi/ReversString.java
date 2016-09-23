package com.xiaomi;

import java.util.Scanner;

public class ReversString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String scannString = scanner.nextLine();
		
		String[] strings = scannString.split(" ");
		
		for (int i = strings.length-1; i >=0; i--) {
			System.out.print(strings[i]+" ");
		}
		
		
	}

}
