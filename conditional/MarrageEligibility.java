package com.pote.engg.conditional;
import java.util.Scanner;

public class MarrageEligibility {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the age of male person");
		double AgeMale = scr.nextDouble();
		//char gender = scr.next().charAt(0);
		
		System.out.println("Enter the age of Female person");
		double AgeFemale = scr.nextDouble();
		char genderM = 'M';
		char genderF = 'F';
		
		if (AgeMale >= 21 && genderM == 'M' ) 
		{
			System.out.println("You are Eligible for marrage");
		}
		else
		{
			System.out.println("Male candidate is not  Eligible for marrage");
		}

		if(AgeFemale >=18 && genderF =='F' )
		{
			System.out.println("You are Eligible for marrage");
	}
		else
		{
			System.out.println("Female candidate is not  Eligible for marrage");
		}

}
	
}

