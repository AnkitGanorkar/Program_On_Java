package com.day12;

public class link {
	// Function to find the biggest of three numbers
	static int biggestOfThree(int x, int y, int z) {

		return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
	}

	// Main driver function
	public static void main(String[] args) {

		// Declaring variables for 3 numbers
		int a, b, c;

		// Variable holding the largest number
		int largest;
		a = 5;
		b = 10;
		c = 3;
		// Calling the above function in main
		largest = biggestOfThree(a, b, c);

		// Printing the largest number
		System.out.println(largest + " is the largest number.");
	}
}Output 10

is the
largest number.Approach 2:
Using the if-else
statements In this method,if-else
statements will
compare and check for
the largest
number by
comparing numbers.‘If’
will check whether‘x’
is greater than‘y’and‘z’
or not.‘else if’
will check whether‘y’
is greater than‘x’and‘z’
or not.And if
both the
conditions are false then‘z’
will be
the largest number.

// Java Program to Find the Biggest of 3 Numbers

// Importing generic Classes/Files
import java.io.*;

class GFG {

	// Function to find the biggest of three numbers
	static int biggestOfThree(int x, int y, int z) {

		// Comparing all 3 numbers
		if (x >= y && x >= z)

			// Returning 1st number if largest
			return x;

		// Comparing 2nd no with 1st and 3rd no
		else if (y >= x && y >= z)

			// Return z if the above conditions are false
			return y;

		else

			// Returning 3rd no, Its sure it is greatest
			return z;
	}

	// Main driver function
	public static void main(String[] args) {
		int a, b, c, largest;

		// Considering random integers three numbers
		a = 5;
		b = 10;
		c = 3;
		// Calling the function in main() body
		largest = biggestOfThree(a, b, c);

		// Printing the largest number
		System.out.println(largest + " is the largest number.");
	}
}
