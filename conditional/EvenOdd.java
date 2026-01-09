package com.pote.engg.conditional;

public class EvenOdd {

	public static void main(String[] args) {
		int number = 2;
		switch(number %2) {
		
		case 0:
			System.out.println("Even number");
			break;
		default :
			System.out.println("Odd number");;
		}

	}

}
