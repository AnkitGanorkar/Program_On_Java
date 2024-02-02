package com.day4;

import java.util.Scanner;

public class Do_while_Loops {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Menu:");
			System.out.println("1. Print Hello");
			System.out.println("2. Print World");
			System.out.println("3. Exit");
			System.out.print("Enter your choice (1-3): ");
			choice = src.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Hello!");
				break;
			case 2:
				System.out.println("World!");
				break;
			case 3:
				System.out.println("Exiting the program. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 3.");
			}
		} while (choice != 3);
	}
}
