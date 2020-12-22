package com.corejava.classesandobjects;

public class InitObjectUsingReference {

	String subject1;
	int subject1Marks;
	String subject2;
	int subject2Marks;
	String subject3;
	int subject3Marks;

	public static void main(String[] args) {

		InitObjectUsingReference ior = new InitObjectUsingReference();

		ior.subject1 = "Physics";
		ior.subject1Marks = 25;

		ior.subject2 = "Chemistry";
		ior.subject2Marks = 23;

		ior.subject3 = "Mathematics";
		ior.subject3Marks = 24;

		int total = ior.subject1Marks + ior.subject2Marks + ior.subject3Marks;
		System.out.println("Total score=" + total);

	}

}
