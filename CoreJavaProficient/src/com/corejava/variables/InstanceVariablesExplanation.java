package com.corejava.variables;

public class InstanceVariablesExplanation {

	String usn;
	String collName;
	String collCode;
	String studentFirstName;
	String studentLastName;
	int age;
	int a = 30;
	int b = 40;

	public static void main(String[] args) {

		InstanceVariablesExplanation iv = new InstanceVariablesExplanation();
		System.out.println("A=" +iv.a);
		System.out.println("B=" + iv.b);

		iv.m1();

	}

	public void m1() {
		
		System.out.println(a);
		System.out.println(b);
		;
	}
}
