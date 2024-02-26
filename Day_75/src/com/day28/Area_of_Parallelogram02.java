package com.day28;

import java.util.Scanner;

public class Area_of_Parallelogram02 {
    // Java Program to Find Area of Parallelogram By Using User Input Value.
    public static void main(String[] args) {
        // creating Scanner class object
        Scanner sc = new Scanner(System.in);
        // Enter base of parallelogram
        System.out.println("Enter base : ");
        int base = sc.nextInt();
        System.out.println("Enter height : ");
        int height = sc.nextInt();
        int area = base * height;
        System.out.println("Area of the parallelogram : " + area);
    }
}
