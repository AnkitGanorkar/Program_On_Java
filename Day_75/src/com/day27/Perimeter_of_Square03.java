package com.day27;

import java.util.Scanner;

public class Perimeter_of_Square03 {
    //Java Program to Find Area and Perimeter of Square By Using User Defined Method
     public static void main(String args[])
    {
        int side;
        //Scanner class object created fro taking user input
        Scanner sc = new Scanner(System.in);
        //taking the length of any side of square from the user
        System.out.print("Enter length of any side of square : ");
        side = sc.nextInt();
        calculate(side);
    }
    
    public static void calculate(int sideLength)
    {
        //finding area of square
        int area = sideLength*sideLength;
        //finding perimeter of square
        int perimeter = 4*sideLength;
        
        System.out.print("Area of Square = " +area);
        
        System.out.print("\nPerimeter of Square = " +perimeter);
    }
    
}
