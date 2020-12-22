package com.corejava.classesandobjects;

public class AnonymousClassObjectExample1 {

	int a,b,c,d;
	
	AnonymousClassObjectExample1(int p,int q)
	{
		a=p;
		b=q;
		int ab=a*b;
		System.out.println("Multiplication of a and b is:"+ab);
	}
	
	public void multiplyTwoNumbers(int x,int y)
	{
		c=x;
		d=y;
		int cd=x*y;
		System.out.println("Multiplication of c and d is:"+cd);
	}
	
	
	public static void main(String[] args) {

		new AnonymousClassObjectExample1(5,15);
		new AnonymousClassObjectExample1(1,1).multiplyTwoNumbers(3,3);
		new AnonymousClassObjectExample1(2,2).multiplyTwoNumbers(4,4);

	}

}
