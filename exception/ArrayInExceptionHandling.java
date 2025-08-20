package com.pote.engg.exception;

public class ArrayInExceptionHandling {

	public static void main(String[] args) {
	try {
			int arr[]= {10,20,30,40,50};

		System.out.println("arry of ::"+arr[5] );
		//throw new RuntimeException("Array no is not there");
		}
		catch(ArrayIndexOutOfBoundsException arrEx) {
			
			System.out.println("Inside the catch");

		}

	}

}
