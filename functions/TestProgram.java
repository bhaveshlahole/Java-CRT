package com.pote.engg.functions;

public class TestProgram {
	static int a = 10;


	public static void main(String[] args) {
		TestProgram obj = new TestProgram();
		obj.test();
		
		System.out.println("a value "+a);

	}
	public void test() {
		a = 20;
		System.out.println("a value ::  "+a);
	}

}
