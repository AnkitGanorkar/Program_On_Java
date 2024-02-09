package com.day11;

import java.util.Scanner;

public class Prime_Number_Pattern {
	public static void main(String[] args) {
		int r;
		int cn = 1;
		int count;
		System.out.println("Number Range : ");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				for (int k = cn + 1; k <= 10000; k++) {
					cn = k;
					count = 0;
					for (r = 1; r <= cn; r++) {
						if (cn % r == 0) {
							count++;
						}
					}
					if (count == 2) {
						System.out.printf("%3d ", cn);
						break;
					}
				}
			}
			System.out.println();
		}

	}
}
