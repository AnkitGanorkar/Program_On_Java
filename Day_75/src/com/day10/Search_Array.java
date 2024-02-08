package com.day10;

public class Search_Array {
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50 };
		int searchKey = 30;
		boolean found = false;
		for (int number : numbers) {
			if (number == searchKey) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Element found in the array.");
		} else {
			System.out.println("Element not found in the array.");
		}
	}
}
