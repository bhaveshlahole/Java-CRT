package com.pote.engg.exception;

public class ThrowKeyword {
	public void testException() {
		int a=10/0;
		throw new ArrayIndexOutOfBoundsException();
	}

	public static void main(String[] args) {
		System.out.println("Inside the Main method");
		ThrowKeyword obj = new ThrowKeyword();
		try {
			obj.testException();
		}catch(Exception ex) {
			System.out.println("Throws exception handled");

		}
			
	}

}
