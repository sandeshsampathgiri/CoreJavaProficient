package com.corejava.variables;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {

		int num1, num2;
		Scanner sc1, sc2;
		int product;
		
		Multiplication mul = new Multiplication();

		System.out.println("Enter the first number");
		sc1 = new Scanner(System.in);
		num1 = sc1.nextInt();

		System.out.println("Enter the second number");
		sc2 = new Scanner(System.in);
		num2 = sc2.nextInt();

		product=mul.findProduct(num1, num2);
		System.out.println("Product of " + num1 + " and " + num2 + " is "+product);

	}
	
	public int findProduct(int num1,int num2)
	{
		
		int product;
		product=num1*num2;
		return product;
	}

}
