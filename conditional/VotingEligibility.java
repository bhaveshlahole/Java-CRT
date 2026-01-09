package com.pote.engg.conditional;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the age of person");
		
		double age = scr.nextDouble();
		char nationality = 'I';
		// 
		//System.out.println("Enter the nationality of person");
		
		if (nationality == 'I') {
			System.out.println("You are indian");
		}
		
		if(age >= 18.5)
		{
			System.out.println("The person is Eligible for Voting");
		}
		else
		{
			System.out.println("The person is not Eligible for voting");
		}

	}

}
