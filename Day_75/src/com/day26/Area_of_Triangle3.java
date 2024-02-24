package com.day26;

import java.util.Scanner;

//Java Program to Find Area of Triangle Using Constructor
public class Area_of_Triangle3 {
	class TriangleArea {
		long area;

		// Constructor
		TriangleArea(long width, long hight) {
			// finding area
			area = (width * hight) / 2;
		}
	}
//Driver Class
class Main
{
   public static void main(String args[]) 
    {   
      Scanner sc= new Scanner(System.in);
      // Asking user to take width input
      System.out.println("Enter the width of triangle:");
      long width= sc.nextLong();
      // Asking user to take hight input
      System.out.println("Enter the height of triangle:");
      long hight= sc.nextLong();
      TriangleArea t=new TriangleArea(width,hight);
      System.out.println("Area of triangle: " + t.area);      
   }
}
}
