package com.pote.engg.operators;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		/*
		  double principal = 100000;
		double time = 12.5;
		double Rate = 2.5;
		double si = (principal*Rate*time)/100;
		System.out.println("Simple intresr :: "+ si);
		
		*/
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the principal amount");
		double principal = scr.nextDouble();
      
		System.out.println("Enter the Rate of intrest");
		double Rate = scr.nextDouble();

		System.out.println("Enter the Time of intrest");
		double Time = scr.nextDouble();
		
		System.out.println("Simple intrest :: "+ (principal*Rate*Time));
		


		

	}

}
