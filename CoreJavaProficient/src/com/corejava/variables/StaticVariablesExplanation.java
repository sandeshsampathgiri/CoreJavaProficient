package com.corejava.variables;

public class StaticVariablesExplanation {

	String name;
	static int a=20;
	static int b=30;
	int c=40;
	
	
	public static void main(String[] args) {
	
		System.out.println(StaticVariablesExplanation.a);
		System.out.println(StaticVariablesExplanation.b);
		//System.out.println(StaticVariablesExplanation.c);
		
		StaticVariablesExplanation sv = new StaticVariablesExplanation();
		System.out.println(sv.c);
		

	}

}
