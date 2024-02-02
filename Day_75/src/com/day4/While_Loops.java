package com.day4;

public class While_Loops {
	public static void main(String[] args) {
		System.out.println(":find the sum of numbers from 1 to 5:");
		int sum = 0;
		int number = 1;
		while (number <= 5) {
			sum += number;
			number++;
		}
		System.out.println("Sum: " + sum);
	}
}
