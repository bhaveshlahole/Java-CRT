package com.pote.engg.wrapperclass;

public class Autoboxing {

	public static void main(String[] args) {
		int number = 10;
		Integer wrapperInt = number; // auto primitive to wrapper
		int intVal = wrapperInt.intValue(); // wrapper -> primitive
		System.out.println("Wrapper integer:: "+ wrapperInt);
	}
		
	 
}
