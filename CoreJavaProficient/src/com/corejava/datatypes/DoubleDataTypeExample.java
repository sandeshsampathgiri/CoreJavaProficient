package com.corejava.datatypes;

import java.util.Scanner;

public class DoubleDataTypeExample {

	final float pi = 3.14f;

	public static void main(String[] args) {

		DoubleDataTypeExample dd = new DoubleDataTypeExample();
		double area;

		System.out.println("Enter the radius");
		Scanner sc = new Scanner(System.in);

		float radius = sc.nextFloat();
		area = dd.calcArea(radius);
		System.out.println("Area of the circle="+area);
	}

	double calcArea(float radius) {
		double area;
		area = pi * radius * radius;
		return area;
	}

}
