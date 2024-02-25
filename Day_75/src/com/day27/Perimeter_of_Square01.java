package com.day27;

public class Perimeter_of_Square01 {
    //Java Program to Find Area and Perimeter of Square By Using Static Values
    public static void main(String args[])
    {
        int sideLength;
        // length of each side of square is given
        sideLength = 5;
        //finding area of square
        int area = sideLength*sideLength;
        //finding perimeter of square
        int perimeter = 4*sideLength;
        
        System.out.print("Area of Square = " +area);
        
        System.out.print("\nPerimeter of Square = " +perimeter);
    }
    
}
