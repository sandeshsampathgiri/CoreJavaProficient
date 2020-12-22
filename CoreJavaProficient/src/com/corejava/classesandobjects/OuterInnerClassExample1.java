package com.corejava.classesandobjects;

public class OuterInnerClassExample1 {

	public class InnerClassExample {

		public void calcSquare(int x)
		{
			int prod=x*x;
			
		}
	}

	public static void main(String[] args)
	{
		OuterInnerClassExample1 outer = new OuterInnerClassExample1();
		OuterInnerClassExample1.InnerClassExample inner = outer.new InnerClassExample();
		inner.calcSquare(20);
		
		
		
		
		
	}

}
