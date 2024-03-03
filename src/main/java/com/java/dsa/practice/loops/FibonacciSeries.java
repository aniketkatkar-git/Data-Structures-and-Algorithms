package com.java.dsa.practice.loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count, a=0, b=1, c;
		
		System.out.print("Enter the number :: ");
		count = sc.nextInt();
		
		System.out.print("The fibonacci series is :: "+a+" "+b);
		
		for(int i=2;i<count;i++) {
			c = a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}