package com.day22;

public class Private_Constructors {
	// create private constructor
	private Private_Constructors() {
		System.out.println("This is a private constructor.");
	}

	// create a public static method
	public static void instanceMethod() {

		// create an instance of Test class
		Private_Constructors obj = new Private_Constructors();
	}

}

class Main {

	public static void main(String[] args) {

		// call the instanceMethod()
		Private_Constructors.instanceMethod();
	}
}
