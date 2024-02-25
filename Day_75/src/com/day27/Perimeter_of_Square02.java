package com.day27;

import java.util.Scanner;

public class Perimeter_of_Square02 {
    //Java Program to Find Area and Perimeter of Square By Using Dynamic Values
    public static void main(String args[])
    {
        int side, perimeter, area;
        //Scanner class object created fro taking user input
        Scanner sc = new Scanner(System.in);
        //taking the length of any side of square from the user
        System.out.print("Enter length of any side of square : ");
        side = sc.nextInt();
        
        //finding area of square
        area = side*side;
        //finding perimeter of square
        perimeter = 4*side;
        
        System.out.print("Area of Square = " +area);
        
        System.out.print("\nPerimeter of Square = " +perimeter);
    }
    
}
