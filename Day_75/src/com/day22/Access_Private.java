package com.day22;

public class Access_Private {

	// Access private fields using getter and setter methods
	// private variables
	private int age;
	private String name;

	// initialize age
	public void setAge(int age) {
		this.age = age;
	}

	// initialize name
	public void setName(String name) {
		this.name = name;
	}

	// access age
	public int getAge() {
		return this.age;
	}

	// access name
	public String getName() {
		return this.name;
	}

}

class Main {
	public static void main(String[] args) {
		// create an object of Test
		Access_Private test = new Access_Private();

		// set value of private variables
		test.setAge(24);
		test.setName("Programiz");

		// get value of private variables
		System.out.println("Age: " + test.getAge());
		System.out.println("Name: " + test.getName());
	}
}
