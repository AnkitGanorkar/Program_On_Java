package com.day21;

import java.util.LinkedList;

public class Collection_to_LinkedList {
	public static void main(String[] args) {
		LinkedList<String> mammals = new LinkedList<>();

		mammals.add("Dog");
		mammals.add("Cat");
		mammals.add("Horse");
		System.out.println("Mammals: " + mammals);

		LinkedList<String> animals = new LinkedList<>();
		animals.add("Crocodile");

		// Add all elements of mammals in animals
		animals.addAll(mammals);
		System.out.println("Animals: " + animals);
	}
}
