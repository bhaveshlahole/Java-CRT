package com.pote.engg.wrapperclass;

public class WrapperToPrimitive {

	public static void main(String[] args) {
		char ch = 'A';
		
		Character wrapperInt = new Character(ch);
		System.out.println("DataType :: "+ ch);
		
		char charVal = wrapperInt.charValue(); // wrapper -> primitive
		System.out.println("intval :: "+ charVal);
	}


	

}
