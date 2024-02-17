package com.day19;

public class Wave_Pattern2 {

	public static void main(String[] args) {
		int wave_height = 4;
		int wL = 8;
		int wH = wave_height - 1;
		int x = wH;
		int cp;
	
		for (int i = 0; i <= wH; i++) {
			cp = 'z';
			for (int j = 0; j <= wH * wL; j++) {
				if (j % (wH * 2) == x || j % (wH * 2) == wH + i) {
					System.out.print((char) cp);
				} else {
					System.out.print(" ");
				}
				cp--;
				if (cp < 'A') {
					cp = cp + 26;
				}
			}
			x--;
			System.out.println();
	
		}
	}

}
