package com.corejava.classesandobjects;

public class AnonymousObjectExample2 {

	int a;
	
	public AnonymousObjectExample2(int x) {
		a=x;
		
	}
	
	void calcArea()
	{
		int area=a*a;
		System.out.println("Area is:"+area);
	}
	
	void calcPerimeter(int b)
	{
		int perimeter=4*b;
		System.out.println("Perimeter is:"+perimeter);
	}

	public static void main(String[] args) {
		
		new AnonymousObjectExample2(10);
		new AnonymousObjectExample2(10).calcArea();
		new AnonymousObjectExample2(10).calcPerimeter(3);

	}

}
