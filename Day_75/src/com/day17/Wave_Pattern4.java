package com.day17;

public class Wave_Pattern4 {
	public static void main(String[] args) {
		int wave_height = 8;
		int wave_length = 7;

		int i;
		int j;
		int k;

		for (i = 1; i <= wave_height; i++) {
			for (j = 1; j <= wave_length; j++) {
				for (k = 1; k <= wave_height; k++) {
					if (i==k||i+k==wave_height+1) {
						System.out.print("#");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.print("\n");
		}
	}
}
