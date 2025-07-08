package com.pote.engg.operators;

public class NestedTernary {

	public static void main(String[] args) {
		double percentage = 70.5;
		
		char result = (percentage>=90)?'O':
			            (percentage >= 75)?'d':
			            	(percentage >= 60)?'A':'F';
		System.out.println("Grade is :: "+ result);
	}

}
