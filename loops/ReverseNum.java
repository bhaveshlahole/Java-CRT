package com.pote.engg.loops;

public class ReverseNum {

	public static void main(String[] args) {
		int revnum = 0;
		int num = 123;
		int rem = 0;
		while(num > 0) {
			rem = num%10;
			num = num/10;
			revnum = revnum*10+rem;
		}
		
		System.out.println("Reverse number is :: "+revnum);

	}

}
