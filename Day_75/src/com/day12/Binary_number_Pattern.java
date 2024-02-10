package com.day12;

import java.util.Scanner;

public class Binary_number_Pattern {
	public static void main(String[] args) {
		int x = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number Froom 1 To 10 ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.printf("%5s ", Integer.toBinaryString(x));
				x++;
			}
			System.out.println();
		}
	}
}
