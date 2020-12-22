package com.corejava.classesandobjects;

public class InitObjectUsingConstructor {

	String name;
	int rollNo;
	int age;

	InitObjectUsingConstructor() {

		name = "Amar";
		rollNo = 20;
		age = 35;
	}

	public void displayName() {
		System.out.println("Name=" + name);
	}

	public void displayRollNum() {
		System.out.println("RollNo=" + rollNo);
	}

	public void displayAge() {
		System.out.println("Age=" + age);
	}

	public static void main(String[] args) {

		InitObjectUsingConstructor ioc = new InitObjectUsingConstructor();
		System.out.println("===Student Details===");

		ioc.displayName();
		ioc.displayAge();
		ioc.displayRollNum();
	}

}
