package com.java.dsa.practice.loops;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		// Take input from user till user does not press 'X' or 'x'

		int res = 0;
		
		while(true) {
			System.out.print("Enter the operator :: ");
			char ch = in.next().trim().charAt(0);
			
			if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
				
				System.out.print("Enter two numbers :: ");
				int num1 = in.nextInt();
				int num2 = in.nextInt();
				if (ch == '+')
					res = num1 + num2; 
				if(ch == '-')
					res = num1 - num2;
				if(ch == '*')
					res = num1 * num2;
				if(ch == '/') {
					if(num2 != 0)
						res = num1 / num2;
				}
				if(ch == '%')
					res = num1 % num2;
			}
			else if (ch == 'X' || ch =='x')
				break;
			else
				System.out.println("Invalid operation");
			
			System.out.println("Answer :: "+res);
		}
	}
}