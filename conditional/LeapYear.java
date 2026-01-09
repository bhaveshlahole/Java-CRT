package com.pote.engg.conditional;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter year ");
		double year = scr.nextDouble();
		// int year = 2025;
		
		if((year % 4 == 0)  && (year % 100 != 0))
		{
			System.out.println("The year is leap year");
		}
		else 
		{
			System.out.println("The year is not leap year");
		}
		
		
	}

}
