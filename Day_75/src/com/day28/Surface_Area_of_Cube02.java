package com.day28;

import java.util.Scanner;

public class Surface_Area_of_Cube02 {
    // Java Program to Find Volume and Surface Area of Cube By Using User Input
    // Value.
    public static void main(String[] args) {
        // variables declared
        double side, volume, surfaceArea;
        // Scanner class object created
        Scanner sc = new Scanner(System.in);
        // Taking side length input from user
        System.out.println("Enter length of side of cube : ");
        side = sc.nextDouble();
        // Calculating surface area of Cube
        surfaceArea = 6 * side * side;
        System.out.println("Surface Area of Cube = " + surfaceArea);
        // calculating Volume of Cube
        volume = side * side * side;
        System.out.println("Volume of Cube = " + volume);
    }
}
