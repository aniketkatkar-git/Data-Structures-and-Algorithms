package com.java.dsa.practice.loops;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {

		double b,h,area;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter base of triangle :: ");
		b = sc.nextInt();
		System.out.println();
		System.out.print("Enter height of triangle :: ");
		h = sc.nextInt();

		area = (b * h)/2;

		System.out.println("Area of Triangle is :: "+area);	
	}
}