package com.day13;

// Importing Arrays class from java.util package
import java.util.Arrays;

//Java program to Sort a Subarray in Array
// Using Arrays.sort() method
public class Java_program_to_sort_a_Subarray_array {

	// Main class

	// Main driver method
	public static void main(String[] args) {
		// Custom input array
		// It contains 8 elements as follows
		int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

		// Sort subarray from index 1 to 4, i.e.,
		// only sort subarray {7, 6, 45, 21} and
		// keep other elements as it is.
		Arrays.sort(arr, 1, 5);

		// Printing the updated array which is
		// sorted after 2 index inclusive till 5th index
		System.out.println("Modified arr[] : " + Arrays.toString(arr));
	}
}
