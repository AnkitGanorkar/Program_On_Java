package com_day2;

import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter The number :");
        int num = src.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number in Even");
        } else {
            System.out.println("Number is Odd");
        }
        
    }
    
}
