package com.corejava.variables;

public class ScopeTest {

	int num = 20;

	void m1() {
		int num = 30;
		System.out.println("Num=" + num);
		System.out.println("This num=" + this.num);

	}

	public static void main(String[] args) {
		
		ScopeTest st = new ScopeTest();
		st.m1();

	}

}
