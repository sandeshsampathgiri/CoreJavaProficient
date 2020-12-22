package com.corejava.operators;

public class ArithmeticPrograms5 {

	int x = 9;
	int y = 12;
	int z = 3;

	public static void main(String[] args) {

		ArithmeticPrograms5 a5=new ArithmeticPrograms5();
		a5.m1();
		a5.m2();
	}

	void m1() {
		int exp1 = x - y / 3 + z * 2 - 1;
		System.out.println("Answer1=" + exp1);

	}
	
	void m2()
	{
		int exp2=(x-y)/3+((z*2)-1);
		System.out.println("Answer2="+exp2);
	}
	
	

}
