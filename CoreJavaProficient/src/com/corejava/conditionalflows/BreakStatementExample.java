package com.corejava.conditionalflows;

public class BreakStatementExample {

	public static void main(String[] args) {
	
		for(int i=0;i<10;i++)
		{
			if(i==9)
			{
				System.out.println("Number 9 encountered");
				break;
				
			}
			System.out.println("Inside the for loop");
		}
		System.out.println("Outside the for loop");
	}

}
