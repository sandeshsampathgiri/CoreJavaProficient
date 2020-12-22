package com.corejava.classesandobjects;

public class Person {

	String fullName;
	String hairColor;
	String eyeColor;
	String skinColor;
	float height;
	float weight=20f;
	String name="Krishna";


	public static void main(String[] args) {

		//System.out.println("Printing inside main method");
		
		Person p=new Person();
		System.out.println("Object reference code="+p.hashCode());
		
		//366712642
		
	}
	
	public void eat()
	{
		System.out.println("Eating");
	}
	
	public void sleep()
	{
		System.out.println("Sleeping");
	}
	
	public void walk()
	{
		System.out.println("Walking");
	}

	public void play()
	{
		System.out.println("Playing");
	}
	
	public void study()
	{
		System.out.println("Studying");
	}
	
	public static void printHello()
	{
		System.out.println("Hello World");
	}
}
