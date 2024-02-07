package com.day8;

import java.util.Scanner;

public class Sum_All_Odd_Number {
	public static void printSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int n = sc.nextInt();
		printSum(n);
	}
}