package com.day24;

public class Two_Complex_Number {
	// Add Two Complex Numbers
	double real;
	double imag;

	public Two_Complex_Number(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

	public static void main(String[] args) {
		Two_Complex_Number n1 = new Two_Complex_Number(2.3, 4.5), n2 = new Complex(3.4, 5.0), temp;

		temp = add(n1, n2);

		System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
	}

	public static Two_Complex_Number add(Two_Complex_Number n1, Two_Complex_Number n2) {
		Two_Complex_Number temp = new Two_Complex_Number(0.0, 0.0);

		temp.real = n1.real + n2.real;
		temp.imag = n1.imag + n2.imag;

		return (temp);
	}
}
