package com.day12;

import java.util.Scanner;

public class Hexa_Number_Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number From 1 to 10 ::");
		int n = sc.nextInt();
		int x = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.printf("%x ", x);
				x++;
			}
		}
		System.out.println();
	}
}
