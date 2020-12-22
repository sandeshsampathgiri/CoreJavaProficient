package com.corejava.classesandobjects;

public class InstanceInitialiationBlockExample2 {

	public InstanceInitialiationBlockExample2() {

		System.out.println("Zero argument constructor");
	}

	public InstanceInitialiationBlockExample2(int x) {

		System.out.println("Single argument constructor");
	}

	public InstanceInitialiationBlockExample2(int x, int y) {

		System.out.println("Double argument constructor");
	}

	{
		System.out.println("Instance Initialization Block");

	}

	public static void main(String[] args) {

		new InstanceInitialiationBlockExample2();
		new InstanceInitialiationBlockExample2(20);
		new InstanceInitialiationBlockExample2(20,30);
		
		}
		
	}
