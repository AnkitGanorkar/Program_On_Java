package com.day27;

import java.util.Scanner;

public class Surface_Area_of_Sphere02 {
    //Java Program to Find Volume and Surface Area of Sphere By Using User Input Values.
    public static void main(String[] args) 
    {
         Scanner sc=new Scanner(System.in);
        double radius, surfaceArea, volume;
        
        System.out.print("Enter the radius of Sphere = ");
        radius = sc.nextDouble();
        
        surfaceArea =  4 * Math.PI * radius * radius;
        volume = (4.0 / 3) * Math.PI * radius * radius * radius;
        System.out.println("Surface area of Sphere = "+surfaceArea);
        System.out.println("Volume of Sphere = "+ volume);
    }
    
}
