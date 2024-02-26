package com.day28;

public class Surface_Area_of_Sphere01 {
    //Java Program to Find Volume and Surface Area of Sphere By Using Static Values.
    public static void main(String[] args) 
    {
        //radius of sphere declared
        double radius=1;
        
        //finding surface area of sphere
        double surfaceArea =  4 * Math.PI * radius * radius;
        //finding volume of sphere
        double volume = (4.0 / 3) * Math.PI * radius * radius * radius;
        System.out.println("Surface area of Sphere = "+surfaceArea);
        System.out.println("Volume of Sphere = "+ volume);
    }
}
