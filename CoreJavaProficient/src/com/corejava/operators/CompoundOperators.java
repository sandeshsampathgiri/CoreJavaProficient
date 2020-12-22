package com.corejava.operators;

public class CompoundOperators {

	public static void main(String[] args) {

		int x = 20, y = 30, z = 50;
		x += y;
		y -= x + z;
		z *= x * y;
		System.out.println("x=" + x);		//50
		System.out.println("y=" + y);		//30-(50+50)=> 30-100=> -70
		System.out.println("z=" + z);		//50*50*-70=-175000

	}

}
