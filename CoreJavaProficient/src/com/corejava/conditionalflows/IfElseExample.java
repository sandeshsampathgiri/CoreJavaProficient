package com.corejava.conditionalflows;
import java.util.*;

public class IfElseExample {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Entered number is an even number");
		}
		
		else
		{
			System.out.println("Entered number is an odd number");
		}
		
	}

}
