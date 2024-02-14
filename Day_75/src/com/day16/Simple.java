package com.day16;

import java.util.Scanner;

public class Simple {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int x = src.nextInt();
		System.out.println("Enter Seccond Number : ");
		int y = src.nextInt();
		int r = x + y;
		System.out.println();
		System.out.printf("Addition of two number :: "+r);
	}
}
