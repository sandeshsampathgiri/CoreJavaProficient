package com.corejava.classesandobjects;

public class InstanceInitialiationBlockExample1 {

	public InstanceInitialiationBlockExample1() {
		System.out.println("Zero-argument constructor ");
	}

	{
		System.out.println("Instance block");
	}

	public static void main(String[] args) {

		InstanceInitialiationBlockExample1 iib = new InstanceInitialiationBlockExample1();

	}

}
