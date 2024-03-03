package com.java.dsa.practice.loops;

import java.util.Scanner;

public class CountTheNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the any integer number :: ");
		int num = in.nextInt();
		System.out.println("");
		System.out.print("Enter the any digit to get the count of the given number :: ");
		int numberCount = in.nextInt();
		int count = 0;

		while(num>0) {
			
			int rem = num % 10;
			num = num / 10;
			
			if(rem == numberCount)
				count++;
		}
		System.out.println("The digit "+numberCount+" count is :: "+count);
	}

}