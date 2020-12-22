package com.corejava.operators;

public class LogicalOperators2 {

	public static void main(String[] args) {

		int x = 50, y = 100, z = 200;
		int a, b, c;

		a = ++x; // => a=++50=>a=51 and x=51
		b = y++; // b=100++=> b=100 and y=101
		c = x + y++ + ++z; // c=51+101+201=>c=353

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);

	}

}
