package com.corejava.datatypes;

import java.util.Scanner;

public class FloatDataTypeExample {

	final float pi = 3.14f;

	public static void main(String[] args) {

		FloatDataTypeExample fd = new FloatDataTypeExample();
		float area;

		System.out.println("Enter the radius");
		Scanner sc = new Scanner(System.in);

		float radius = sc.nextFloat();
		area = fd.calcArea(radius);
		System.out.println("Area of the circle="+area);
	}

	float calcArea(float radius) {
		float area;
		area = pi * radius * radius;
		return area;
	}

}
