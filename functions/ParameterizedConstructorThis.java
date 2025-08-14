package com.pote.engg.functions;

public class ParameterizedConstructorThis {
	int a;
	int b;
	ParameterizedConstructorThis(int a,int b){
		this.a = a;
		this.b = b;
	}
	public void printValue() {
		
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		ParameterizedConstructorThis obj = new ParameterizedConstructorThis(10,20);
		obj.printValue();

	}

}
