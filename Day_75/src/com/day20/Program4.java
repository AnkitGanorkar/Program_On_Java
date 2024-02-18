package com.day20;

public class Program4 {
	// No user interaction Sum Of array
	public static void main(String args[]) {
		int[] array = { 10, 20, 30, 40, 50, 10 };
		int sum = 0;
		// Advanced for loop
		for (int num : array) {
			sum = sum + num;
		}
		System.out.println("Sum of array elements is:" + sum);
	}
}
