package com.day26;

public class Area_and_Perimeter01 {
	// Java Program to Find Area and Perimeter of Rectangle By using static values
	public static void main(String[] args) {
		// variables declared
		double length, breadth, perimeter, area;
		// length value declared
		length = 4.2;
		// breadth value declared
		breadth = 2.0;
		// finding perimeter
		perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of rectangle :" + perimeter);
		// finding area
		area = length * breadth;
		System.out.println("Area of rectangle :" + area);
	}

}
