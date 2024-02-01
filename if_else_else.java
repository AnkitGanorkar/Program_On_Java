package com.day3;

import java.util.Scanner;

public class if_else_else {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a = src.nextInt();
		System.out.println("Enter Second Number : ");
		int b = src.nextInt();
		
		if (a==b) {
			System.out.println("Equal Number ");
		}else if(a>b){
			System.out.println("First number is Geter then Second ");
		}else {
			System.out.println("First number is Lesser");
		}
	}

}
