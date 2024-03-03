package com.java.dsa.practice.loops;

import java.util.Scanner;

public class SubtractProductAndSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :: ");
		int num = sc.nextInt();
		int product = 1;
		int sum = 0;
		
		while(num!=0) {
			int rem = num % 10;
			product = product * rem;
			sum = sum + rem;
			num = num / 10;
		}
		
		int ans = product - sum;
		
		System.out.println(ans);
	}
}