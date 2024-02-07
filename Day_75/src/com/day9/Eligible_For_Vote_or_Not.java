package com.day8;

import java.util.Scanner;

public class Eligible_For_Vote_or_Not {
	public static void isElligible(int age) {
	       if(age > 18) {
	    	   System.out.println("Your are Elligible : ");
	       }else {
	    	   System.out.println("Your are Not Elligible");
	       }
	       
	   }
	   public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter Your Number : ");
	      int age = sc.nextInt();
	      System.out.println(isElligible);
	   } 
}
