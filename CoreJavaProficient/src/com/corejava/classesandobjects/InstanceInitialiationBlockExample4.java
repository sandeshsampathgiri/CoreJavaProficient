package com.corejava.classesandobjects;

public class InstanceInitialiationBlockExample4 {

	int employeeId;
	
	{
		employeeId=123;
		
	}
	
	public void display()
	{
		System.out.println(employeeId);
	}
	public static void main(String[] args) {
	
		new InstanceInitialiationBlockExample4().display();
		
	}

}
