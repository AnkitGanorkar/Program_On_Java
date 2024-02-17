package com.day19;

public class Wave_Pattern7 {
	public static void main(String[] args) {
		int wL = 4;
		int wH = 4;
		int x = wH - 1;
		for (int i = 0; i <= wH; i++) {
			for (int j = 0; j <= wH * wL * 2; j++) {
				if (j % (wH * 2) == x || j % (wH * 2) == wH + i) {
					System.out.printf("%02d",j);
				} else {
					System.out.print(" ");
				}
			}
			x--;
			System.out.println();
		}
	}

}
