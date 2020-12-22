package com.corejava.operators;

public class ArithmeticPrograms2 {

	int a = 50, b = 30;

	public static void main(String[] args) {

		ArithmeticPrograms2 t2 = new ArithmeticPrograms2();
		t2.m1();
		t2.m2();
		t2.m3();
		t2.m4();

	}

	void m1() {
		int p = b - a;
		System.out.println("p=" + p);		//p=-20
	}

	void m2() {
		int q = -a * b;
		System.out.println("q=" + q);		//q=-1500
	}

	void m3() {
		int r = a / b;
		System.out.println("r=" + r);		//r=1
	}

	void m4() {
		int s = -a % b;
		System.out.println("s=" + s);		//s=-20
		int t = -a % -b;
		System.out.println("t=" + t);		//t=-20
		int u = a % -b;
		System.out.println("u=" + u);		//u=20

	}

}
