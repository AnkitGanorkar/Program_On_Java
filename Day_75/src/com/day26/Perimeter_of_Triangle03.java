package com.day26;

public class Perimeter_of_Triangle03 {
	// Java Program to Find Perimeter of Triangle Using user defined method
	static double Perimeter(double side1, double side2, double side3) {
		// Finding Perimeter of triangle
		// and returning the perimeter
		return (side1 + side2 + side3);
	}

	// Driver method
	public static void main(String[] args) {
		// lengths for 3sides of triangle declared
		double side1 = 2.2;
		double side2 = 3.0;
		double side3 = 2.2;
		System.out.println(Perimeter(side1, side2, side3));
	}

}
