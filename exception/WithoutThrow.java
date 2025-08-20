package com.pote.engg.exception;

public class WithoutThrow {

	public static void main(String[] args) {
		int arr[] = {10,20};
		try {
			throw new ArithmeticException();
		}
		catch(Exception ex) {
		System.out.println("Inside the Exception");
	}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Inside the arry Index");
		}
	}

}
