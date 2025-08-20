package com.pote.engg.exception;

public class HandleCustomizedException {

	public static void main(String[] args) {
		try {
			throw new MyCustomizedException("My own customized Exception");
		}catch(MyCustomizedException ex) {
			System.out.println(ex.getMessage() +" ustomized Exception");
			System.out.println("Customized Exception Handled Successfully ");
		}
	}

}

