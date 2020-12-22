package com.corejava.classesandobjects;

public class InitObjExample2 {

	int radius;

	public void area(int r) {
		radius = r;
	}

	public void calcArea() {
		double area = 3.14 * radius * radius;
		System.out.println("Area of the circle=" + area);

	}

	public void calcCircumferemce() {
		double circumference = 2 * 3.14 * radius;
		System.out.println("Circumferece of the circle=" + circumference);
	}

	public static void main(String[] args) {

	}

}
