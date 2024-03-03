package com.java.dsa.practice.loops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number :: ");
		int N = in.nextInt();
		int ans = 0;
		
		while(N > 0) {
		
			// N = 12
			int rem = N % 10; // 2
			ans = ans + rem;
			N = N / 10;
		}
		System.out.println("Sum of Digits is :: "+ans);
	}
}