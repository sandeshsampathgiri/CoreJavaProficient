package com.corejava.classesandobjects;

public class InstanceInitialiationBlockExample3 {

	InstanceInitialiationBlockExample3() {
		System.out.println("Zero argument constructor");
	}

	InstanceInitialiationBlockExample3(int x) {
		System.out.println("Single argument constructor");
	}

	{
		System.out.println("First IIB");
	}

	{
		System.out.println("Second IIB");
	}

	public static void main(String[] args) {

		new InstanceInitialiationBlockExample3();
		new InstanceInitialiationBlockExample3(5);

	}

}
