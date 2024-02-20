package com.day22;

public class Singleton_Design {
	  // create a public static variable of class type
	  private static Singleton_Design language;

	  // private constructor
	  private Singleton_Design() {
	    System.out.println("Inside Private Constructor");
	  }

	  // public static method
	  public static Singleton_Design getInstance() {

	     // create object if it's not already created
	     if(language == null) {
	        language = new Singleton_Design();
	     }

	      // returns the singleton object
	      return language;
	  }

	  public void display() {
	      System.out.println("Singleton Pattern is achieved");
	  }
	}

	class Main {
	  public static void main(String[] args) {
		  Singleton_Design db1;

	     // call the getInstance method
	     db1= Singleton_Design.getInstance();

	     db1.display();
	  }
}
