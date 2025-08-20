package com.pote.engg.exception;

public class ArithmaticException {
	public void Addition(int a,int b) {
		try {
			System.out.println("Addition is ::"+(a+b));
		}catch(ArithmeticException arthEx) {
			System.out.println("Enter the proper number");

		}
	}
	
	public void division(int a,int b) {
		try {
			System.out.println("division is ::"+(a/b));
		}catch(ArithmeticException arthEx) {
			System.out.println("Second Number should not be zero");

		}
	}

	public static void main(String[] args) {
		int firstnumber = 0;
		int secondnumber = 0;
		try {
			firstnumber = Integer.parseInt(args[0]);
			secondnumber = Integer.parseInt(args[1]);
		}catch(NumberFormatException number) {
			System.out.println("Enter the valid Number");

		}
		ArithmaticException obj = new ArithmaticException();
		obj.Addition(firstnumber, secondnumber);
		obj.division(firstnumber, secondnumber);


	}

}
