package com.pote.engg.loops;
import java.util.Scanner;

public class DecFor {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number1 ");
		int num1 = scr.nextInt();
		System.out.println("Enter the number 2 ");
		int num2 = scr.nextInt();
		
		for(int i = num1;i>num2;i--)
		{
			System.out.println(i);
		}

	}

}
