package com.pote.engg.loops;

public class MethodRefrence {

	public static void main(String[] args) {
		MethodRefrence obj = new MethodRefrence();
		obj.testMethod(10);

	}
	public void testMethod(int a) {
		System.out.println("runtime argument :: "+a);
	}
}
