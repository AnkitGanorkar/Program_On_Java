package com.day28;

public class Surface_Area_of_Cube01 {
    // Java Program to Find Volume and Surface Area of Cube By Using Static Value.
    public static void main(String[] args) {
        // variables declared
        double side, volume, surfaceArea;
        // Side length of cube is declared
        side = 5.5;
        // Calculating surface area of Cube
        surfaceArea = 6 * side * side;
        System.out.println("Surface Area of Cube = " + surfaceArea);
        // calculating Volume of Cube
        volume = side * side * side;
        System.out.println("Volume of Cube = " + volume);
    }
}
