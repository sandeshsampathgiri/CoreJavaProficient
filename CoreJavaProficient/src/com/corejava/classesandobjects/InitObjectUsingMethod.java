package com.corejava.classesandobjects;

public class InitObjectUsingMethod {

	int length;
	int breadth;
	
	public void calcValue(int l,int b)
	{
		length=l;
		breadth=b;
		
	}
	
	public void findPerimeter()
	{
		int perimeter=2*(length+breadth);
		System.out.println("Perimeter of the rectangle="+perimeter);
	}
	
	
	
	public static void main(String[] args) {
	
		InitObjectUsingMethod iom = new InitObjectUsingMethod();
		iom.calcValue(20, 30);
		
		iom.findPerimeter();
	}

}
