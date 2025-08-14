package com.pote.engg.conditional;
import java.util.Scanner;
public class DivisiblityAndSquare {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number yoy want to check is divisible by number 7");
		double number = scr.nextDouble();
		//float number = 7f;
		if(number %7 == 0) {
			System.out.println("Number is divided by 7 :: The number Square is :: "+ Math.pow(number, 2));
		}
		else
		{
			System.out.println("Number is not divisible by 7");
		}
		

	}

}
