package com.day24;

public class Whitespaces {
	// Program to Remove All Whitespaces
	public static void main(String[] args) {
		String sentence = "T    his is b  ett     er.";
		System.out.println("Original sentence: " + sentence);

		sentence = sentence.replaceAll("\\s", "");
		System.out.println("After replacement: " + sentence);
	}
}
