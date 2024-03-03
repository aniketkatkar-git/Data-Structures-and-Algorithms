package com.java.dsa.practice.loops;

import java.util.Scanner;

public class AreaOfCirle {

	public static void main(String[] args) {

		int r;
		double pi = 3.14, area;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius of cirle :: ");

		r = sc.nextInt();

		pi = 3.14;

		area = pi * r * r;

		System.out.println("Area of Cirle is :: "+area);
	}
}