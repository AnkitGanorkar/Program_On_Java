package com.day8;

import java.util.Scanner;

public class Average {
	public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter Number frist : ");
	      int a = sc.nextInt();
	      System.out.println("Enter Number Second : ");
	      int b = sc.nextInt();
	      System.out.println("Enter Number third : ");
	      int c = sc.nextInt();

	      int average = (a + b + c) / 3;
	      System.out.println(average);
	   }   


}
