package com.pote.engg.operators;

import java.util.Scanner;

public class InputValues {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the length ");
		double length = scr.nextDouble();
		System.out.println("Enter the breadth");
		double breath = scr.nextDouble();
		
		System.out.println("Area of rectanglle is :: "+ (length * breath));
		System.out.println("Area of rectanglle is :: "+ 2*(length+breath));

	}

}
