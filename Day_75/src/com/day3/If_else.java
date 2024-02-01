package com.day3;

import java.util.Scanner;

public class If_else {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter Your number : ");
		int age = src.nextInt();
		if (age > 18) {
			System.out.println("Adult");
		} else {
			System.out.println("NOT Adult");
		}
	}
}
