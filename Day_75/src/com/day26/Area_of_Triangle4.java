package com.day26;

import java.util.Scanner;

public class Area_of_Triangle4 {
	// Java Program to Find Area of Triangle Using User Defined Method
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// Asking user to take width input
		System.out.println("Enter the width of triangle:");
		long width = sc.nextLong();
		System.out.println("Enter the height of triangle:");
		long hight = sc.nextLong();
		// calling the method
		TriangleArea(width, hight);
	}

	// user defined method
	public static void TriangleArea(long width, long hight) {
		long area = (width * hight) / 2;
		System.out.println("Area of triangle: " + area);
	}

}
