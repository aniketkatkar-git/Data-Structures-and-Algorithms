package com.java.dsa.practice.loops;

import java.util.Scanner;

public class AddDigitsUntilTheResultHasOnlyOneDigit {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		
		addDigits(num);
	}

	public static int addDigits(int num) {
		int ans = 0;

		if(num<10)
			return num;

		while (num > 0) {
			int rem = num % 10;
			ans += rem;
			num = num / 10;
		}
		return addDigits(num);
	}
}