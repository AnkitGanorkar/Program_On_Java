package com.day11;

public class Oops_Concept {
	public static void main(String[] args) {
		try {
			int result = divide(10, 0);
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static int divide(int num1, int num2) {
		return num1 / num2;
	}
}
