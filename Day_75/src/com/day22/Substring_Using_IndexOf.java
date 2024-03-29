package com.day22;

public class Substring_Using_IndexOf {
	// Check if a string contains a substring using indexOf()
	public static void main(String[] args) {
		// create a string
		String txt = "This is Programiz";
		String str1 = "Programiz";
		String str2 = "Programming";

		// check if str1 is present in txt
		// using indexOf()
		int result = txt.indexOf(str1);
		if (result == -1) {
			System.out.println(str1 + " not is present in the string.");
		} else {
			System.out.println(str1 + " is present in the string.");
		}

		// check if str2 is present in txt
		// using indexOf()
		result = txt.indexOf(str2);
		if (result == -1) {
			System.out.println(str2 + " is not present in the string.");
		} else {
			System.out.println(str2 + " is present in the string.");
		}
	}
}
