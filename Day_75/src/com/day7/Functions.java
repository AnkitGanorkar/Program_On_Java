package com.day7;

import java.util.Scanner;

public class Functions {
	 public static int calculatesum(int a,int b) {
		 int sum =a+b;
		 return sum;
	 }
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter Your first num : ");
		int a = src.nextInt();
		System.out.println("Enter your second num : ");
		int b =src.nextInt();
		
		int sum =calculatesum(a, b);
		System.out.println("Sum of 2 Number is : "+sum);
	}
}
