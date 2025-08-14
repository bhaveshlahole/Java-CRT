package com.pote.engg.functions;

public class ParameterizedConstructorDemo {
	
	ParameterizedConstructorDemo(int a , int b){
		System.out.println("Inside the parameterized constructor");
	}
	public static void main(String[] args) {
		
		ParameterizedConstructorDemo obj = new  ParameterizedConstructorDemo(10,20);
			
		}
		

	}

// imp we can not return val in parameterised constructor
