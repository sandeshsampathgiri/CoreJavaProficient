package com.corejava.variables;

public class CollegeMarks {

	int subject1Marks = 10;
	int subject2Marks = 20;
	int subject3Marks = 30;
	int subject4Marks = 40;
	int subject5Marks = 50;
	int subject6Marks = 60;

	public static void main(String[] args) {

		CollegeMarks cm1 = new CollegeMarks();
		CollegeMarks cm2 = new CollegeMarks();

		System.out.println("Total of Student1 Marks="+(cm1.subject1Marks+cm1.subject2Marks+cm1.subject3Marks+cm1.subject4Marks+cm1.subject5Marks+cm1.subject6Marks));
		System.out.println("Total of Student2 Marks="+((cm1.subject1Marks-5)+(cm1.subject2Marks-5)+(cm1.subject3Marks-5)+(cm1.subject4Marks-5)+(cm1.subject5Marks-5)+(cm1.subject6Marks-5)));
		
		
		
	
	
	}

}
