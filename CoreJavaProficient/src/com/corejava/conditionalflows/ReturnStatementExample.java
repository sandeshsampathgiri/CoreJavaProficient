package com.corejava.conditionalflows;

import java.util.*;

public class ReturnStatementExample {

	public static void main(String[] args) {

		ReturnStatementExample rs = new ReturnStatementExample();
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int result = rs.calculateSquare(num);
		System.out.println("Square of the entered number is " + result);

	}

	public int calculateSquare(int num) {

		return num * num;
	}

}
