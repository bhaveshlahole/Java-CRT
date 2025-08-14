package com.pote.engg.functions;
import java.util.Scanner;

public class ReturnArgumentDemo {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number");
		int value= scr.nextInt();
		ReturnArgumentDemo argumentDemo = new ReturnArgumentDemo();
		int square = argumentDemo.processData(value);
		System.out.println("Square is :: "+square);

	}
	public int processData(int value) {
		
	return (int) Math.pow(value,2);
	}

}