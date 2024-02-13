package com.day15;

import java.util.*;

public class ArrayList_in_Ascending_Order {
	// Java program to demonstrate
	// How to sort ArrayList in ascending order

	public static void main(String args[]) {

		// Get the ArrayList
		ArrayList<String> list = new ArrayList<String>();

		// Populate the ArrayList
		list.add("Ghsnsham");
		list.add("Ram");
		list.add("Alex");
		list.add("Kunal");
		list.add("Ankit");

		// Print the unsorted ArrayList
		System.out.println("Unsorted ArrayList: " + list);

		// Sorting ArrayList in ascending Order
		// using Collection.sort() method
		Collections.sort(list);

		// Print the sorted ArrayList
		System.out.println("Sorted ArrayList " + "in Ascending order : " + list);

	}

}
