package com.corejava.datatypes;

import java.util.Scanner;

public class GetAsciiValue {

	public static void main(String[] args) {

		GetAsciiValue gav = new GetAsciiValue();

		System.out.println("Enter the ascii character");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		gav.getValue(input);
		

	}

	public void getValue(String input) {

		int asciiValue = 0;
		if(input.length()==1)
		{
		char ch = input.charAt(0);
		asciiValue = (int) ch;
		System.out.println("ASCII value=" + asciiValue);
		}
		else
		{
			System.out.println("Please provide a valid input");
		}

	}
}
