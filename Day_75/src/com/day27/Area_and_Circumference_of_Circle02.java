package com.day27;

import java.util.Scanner;

public class Area_and_Circumference_of_Circle02 {
    //Java Program to Find Area and Circumference of Circle By Using User Input Values
     public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      //Asking the user for radius input
      System.out.print("Enter the radius: ");
      double r = sc.nextDouble();
      //Finding area of circle
      double area = Math.PI * (r * r);
      System.out.println("Area of circle : " + area);
      //Finding circumference of circle
      double circumference= Math.PI * 2*r;
      System.out.println( "Circumference of the circle : "+circumference) ;
   }
}
