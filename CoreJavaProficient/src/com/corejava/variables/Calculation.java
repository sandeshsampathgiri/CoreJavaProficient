package com.corejava.variables;

public class Calculation {
	//This program calculates the sum of two integers

	int a = 20;
	int b = 30;

	Calculation() {

		int c = 50;
	}

	void addition() {
		int x = 100;
		int add = a + b + x;
		System.out.println("Sum=" + add);
	}

	void subtraction() {
		int sub = a - b;
		System.out.println("Sub=" + sub);

	}

	public static void main(String[] args) {

		Calculation cal  = new Calculation();
		cal.addition();
		cal.subtraction();
	}

}
