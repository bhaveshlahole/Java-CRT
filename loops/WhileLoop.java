package com.pote.engg.loops;

public class WhileLoop {

	public static void main(String[] args) {
		// initlilization
		int initial =1;
		int sum = 0;
		while(initial<=50)
		{
			sum = sum+initial;

			initial++;
		}
		System.out.println("sum "+sum);
		
	}

}
