package com.pote.engg.wrapperclass;

public class Unboxing {

	public static void main(String[] args) {
		
		Integer wrapperInt = new Integer(10);
		int intVal = wrapperInt; // Auto wrapper -> primitive= unboxing
		System.out.println("intval :: "+ intVal);
	}

}
