package com.day26;

import java.util.Scanner;

public class Area_and_Perimeter02 {
	
	// Java Program to Find Area and Perimeter of Rectangle By using dynamic values
	public static void main(String[] args) {
		// variables declared
		int length, breadth, perimeter, area;
		Scanner sc = new Scanner(System.in);
		// taking length input from user
		System.out.print("Enter length of rectangle : ");
		length = sc.nextInt();
		// taking breadth input from user
		System.out.print("Enter breadth of rectangle : ");
		breadth = sc.nextInt();
		// finding perimeter
		perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of rectangle : " + perimeter);
		// finding area
		area = length * breadth;
		System.out.println("Area of rectangle : " + area);
	}

}
