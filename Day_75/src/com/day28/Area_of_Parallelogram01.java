package com.day28;

import java.util.Scanner;

public class Area_of_Parallelogram01 {
    // Java Program to Find Area of Parallelogram By using Static Value.
    public static void main(String[] args) {
        // creating Scanner class object
        Scanner sc = new Scanner(System.in);
        // base and height of parallelogram delared
        int base = 4;
        int height = 5;
        // calculating area of paralleologram
        int area = base * height;
        System.out.println("Area of the parallelogram : " + area);
    }
}
