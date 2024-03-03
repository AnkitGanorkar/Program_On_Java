package com.day28;

import java.util.Scanner;

public class Surface_Area_of_Sphere03 {
    //Java Program to Find Volume and Surface Area of Sphere By Using User Defined Method.
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        double radius;
        //taking radius input from user
        System.out.print("Please Enter the radius of a Sphere : ");
        radius = sc.nextDouble();
                //calling the calulate() method
        calculate(radius);
    }
        //user defined method i.e calculate() method
        // to find surface area and volume of sphere
    public static void calculate(double radius)
    {
        //finding surface area of sphere
        double surfaceArea =  4 * Math.PI * radius * radius;
        //finding volume of sphere
        double volume = (4.0 / 3) * Math.PI * radius * radius * radius;
        System.out.println("Surface area of Sphere = "+surfaceArea);
        System.out.println("Volume of Sphere = "+ volume);
        System.out.println("Volume of Sphere = "+ volume);
        
    }
    
}
