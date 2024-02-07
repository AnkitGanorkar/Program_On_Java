package com.day9;

import java.util.Scanner;

public class Eligible_For_Vote_or_Not {
	public static String checkVotingEligibility(int age) {
		if (age > 18) {
			return "Eligible to vote";
		} else {
			return "Not eligible to vote";
		}
	}

	public static void main(String[] args) {
		// Example usage:
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		System.out.println(checkVotingEligibility(age));
	}
}
