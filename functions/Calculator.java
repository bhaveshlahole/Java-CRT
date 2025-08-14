package com.pote.engg.functions;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("Enter 1 for addition :: 2 for substraction :: 3 for multiplication :: 4 for division");
		Scanner scr = new Scanner(System.in);
		
		//System.out.println("Enter number 1 or 2 or 3 or 4 ");
		int number = scr.nextInt();
		System.out.println("Enter number1 ");
		double a = scr.nextDouble();
		System.out.println("Enter number2 ");
		double b = scr.nextDouble();
		
		do {
	
			
			switch(number) {
			
			case 1:
				System.out.println(" addition is "+ (a+b)+"---------");
				break;
				
			case 2:
				System.out.println(" Substractio is "+ (a-b)+"--------");
				break;
			
			case 3:
				System.out.println("multiplication  is "+ (a*b)+"------");
				break;
			case 4:
				System.out.println(" division is "+ (a/b)+"-----------");
				break;
		
				default:
					System.out.println("you entered wrong number");
			}
		}while(number>=6);

	}

}
