package com.day18;

public class Wave_Pattern1 {
	public static void main(String[] args) {
		int wave_height = 8;
		int wL = 8;
		int wH = wave_height - 1;
		int x = wH;
		for (int i = 0; i <= wH; i++) 
		{
			for (int j = 0; j <= wH * wL; j++) 
			{
				if (j % (wH * 2) == x || j % (wH * 2) == wH + i)
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			x--;
			System.out.println();

		}
	}
}
