package com.day28;

import java.util.Scanner;

public class Area_of_Pentagon02 {
    // Using User Defined Value.
    public static void main(String[] args) {
        // creating Scanner class object
        Scanner sc = new Scanner(System.in);
        // Enter side length of pentagon
        System.out.println("Enter side length of Pentagon :");
        int a = sc.nextInt();
        double area = (Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(a, 2)) / 4.0;
        int perimeter = (5 * a);
        System.out.println("Area of Pentagon = " + area);
        System.out.println("Perimeter of Pentagon = " + perimeter);
    }

}
