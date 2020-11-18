package com.corejava.variables;

public class Student {
	
	Student()
	{
		String nCollege="PIET";
		System.out.println("College name="+nCollege);
	}
	
	public int subMarks()
	{
		int physicsMarks=50;
		int chemistryMarks=60;
		int mathsMarks=70;
		int totalMarks=physicsMarks+chemistryMarks+mathsMarks;
		return totalMarks;
	}

	public static void main(String[] args) {
		
		Student st=new Student();
		//System.out.println("Name of the college="+nCollege);
		int total=st.subMarks();
		System.out.println("Total="+total);

	}

}
