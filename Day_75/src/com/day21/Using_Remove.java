package com.day21;

import java.util.LinkedList;

public class Using_Remove {
	public static void main(String[] args) {
		LinkedList<String> languages = new LinkedList<>();

		// add elements in LinkedList
		languages.add("Java");
		languages.add("Python");
		languages.add("JavaScript");
		languages.add("Kotlin");
		System.out.println("LinkedList: " + languages);

		// remove elements from index 1
		String str = languages.remove(3);
		System.out.println("Removed Element: " + str);

		System.out.println("Updated LinkedList: " + languages);
	}
}
