package com.day2;

import java.util.Scanner;

public class Scanner_Function {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		// Declaring variable
		String a;
		int b;
		String c;

		System.out.println("Enter Your Name: ");
		a = src.nextLine();
		System.out.println("Enter Your Number: ");
		b = src.nextInt();
		System.out.println("Enter Your Loction: ");
		c = src.next();
		System.out.println(" ");
		System.out.println("Name: " +a);
		System.out.println("Number: " +b);
		System.out.println("Loction: " +c);

	}

}
