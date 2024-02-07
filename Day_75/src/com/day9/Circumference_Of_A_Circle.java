package com.day8;

import java.util.Scanner;

public class Circumference_Of_A_Circle {
	public static Double getCircumference(Double radius) {
		return 2 * 3.14 * radius;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entr Your Number : ");
		Double r = sc.nextDouble();
		System.out.println(getCircumference(r));
	}
}
