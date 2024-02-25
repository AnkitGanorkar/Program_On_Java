package com.day27;

public class Area_and_Circumference_of_Circle01 {
    //Java Program to Find Area and Circumference of Circle By Using Static Values
    public static void main(String args[])
   {
       //radius value declared
        double r = 1;
      //Finding area of circle
      double area = Math.PI * (r * r);
        System.out.println("Area of circle : " + area);
      //Finding circumference of circle
      double circumference= Math.PI * 2*r;
        System.out.println( "Circumference of the circle : "+circumference) ;
   }
}
