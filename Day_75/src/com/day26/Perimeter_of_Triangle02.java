package com.day26;

import java.util.Scanner;

public class Perimeter_of_Triangle02 {
	// Java Program to Find Perimeter of Triangle Using dynamic value
	// Driver method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// length of 3 sides of triangle will be taken by the user
		System.out.print("Enter length for side1 = ");
		double side1 = sc.nextDouble();
		System.out.print("Enter length for side2 = ");
		double side2 = sc.nextDouble();
		System.out.print("Enter length for side3 = ");
		double side3 = sc.nextDouble();
		// finding the perimeter
		double perimeter = (side1 + side2 + side3);
		System.out.println("Perimeter of triangle = " + perimeter);
	}

}
