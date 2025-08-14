package com.pote.engg.functions;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner Scr = new Scanner(System.in);
		System.out.println("Enter the number you want to print");
	
		
		int revnum = 0;
		int num = 123;
		int tempnumber = num;
		int rem = 0;
		while(num > 0) {
			rem = num%10;
			num = num/10;
			revnum = revnum*10+rem;
		}
		if(tempnumber ==revnum ) {
			System.out.println("it is palindrome");
			
		}
		else {
			System.out.println("it is not palindrome");
			
		}
		
		
	

	}

}
