package com.day7;

import java.util.Scanner;

public class Call_Function {
	public static int calculateMulti(int a,int b) {
		 int multi =a*b;
		 return multi;
	 }
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter Your first num : ");
		int a = src.nextInt();
		System.out.println("Enter your second num : ");
		int b =src.nextInt();
		
		int sum =calculateMulti(a, b);
		System.out.println("Multiplication   of 2 Number is : "+sum);
	}
}
