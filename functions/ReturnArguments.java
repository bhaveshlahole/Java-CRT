package com.pote.engg.functions;

public class ReturnArguments {

	public static void main(String[] args) {
		ReturnArguments obj = new ReturnArguments();
		int returnData = obj.returnValue();
		System.out.println(returnData);

	}
	public int returnValue() {
		System.out.println("Inside the method s");
		return 1;
	}
	

}
