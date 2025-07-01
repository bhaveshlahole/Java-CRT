package com.pote.engg.operators;

public class GradeOfStudent {

	public static void main(String[] args) {

		int marks = 95;
		String GradeA = "Pass";
		String GradeB = "Faie";
		String grade = (marks>90)? GradeA :GradeB ;
		System.out.println("Students grade "+ grade);
	}

}
