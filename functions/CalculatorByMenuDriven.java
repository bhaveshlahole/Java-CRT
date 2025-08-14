package com.pote.engg.functions;
import java.util.Scanner;

public class CalculatorByMenuDriven {
	int a;
	int b;
	CalculatorByMenuDriven(int a,int b){
		
	}
	public void printValue() {
		
		System.out.println("Addition is :: "+a+b);
		System.out.println("Substraction  is :: "+(a-b));
		System.out.println("Multiplication is :: "+(a*b));
		System.out.println("Division is :: "+(a/b));
		
	}

	public static void main(String[] args) {
		ParameterizedConstructorThis obj = new ParameterizedConstructorThis(10,20);
		obj.printValue();
		

	
		
	}

}
