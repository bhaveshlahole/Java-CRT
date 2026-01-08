package com.pote.engg.datatypedemo;

public class SwappingNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		System.out.println("Before Value of first number"+a);
		System.out.println("Before Value of second number"+b);
		c = a;
		a = b;
		b = c;
		System.out.println(" ");
		
		System.out.println("After Value of first number"+a);
		System.out.println("After Value of second number"+b);


	}

}
