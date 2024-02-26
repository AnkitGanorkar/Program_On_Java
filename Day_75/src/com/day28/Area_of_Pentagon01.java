package com.day28;

import java.util.Scanner;

public class Area_of_Pentagon01 {
    // Using Static Value.
    public static void main(String[] args) {
        // creating Scanner class object
        Scanner sc = new Scanner(System.in);
        // Enter side length of pentagon
        System.out.println("Enter side length of Pentagon :");
        double a = 5.5;
        double area = (Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(a, 2)) / 4.0;
        double perimeter = (5 * a);
        System.out.println("Area of Pentagon = " + area);
        System.out.println("Perimeter of Pentagon = " + perimeter);
    }
}
