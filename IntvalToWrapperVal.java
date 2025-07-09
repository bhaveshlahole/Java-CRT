package com.pote.engg.wrapperclass;

public class IntvalToWrapperVal {

	public static void main(String[] args) {
		int number = 10;
		Integer  wrapperInt = new Integer(number); // primitive -> wrapper
		System.out.println("WrapperInt :: "+wrapperInt);
		
		int intVal = wrapperInt.intValue(); // wrapper -> primitive
		System.out.println("intval :: "+ intVal);
	}

}
