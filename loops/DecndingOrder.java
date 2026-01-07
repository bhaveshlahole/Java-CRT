package com.pote.engg.loops;
import java.util.Scanner;

public class DecndingOrder {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number one");
		int num1 = scr.nextInt();
		
		System.out.println("Enter the number Two");
		int num2 = scr.nextInt();
		
		// int initial = num1;
		if(num1<num2) {
			System.out.println("First number should be greater");
		}
		if((num1 - num2)<=5){
			int temp = num1-1;
			int temp2 = num2+1;
			while(temp >= temp2) {
				System.out.println(temp);
				temp--;
			}
		} else{
			System.out.print("please enter the difference betwen the number upto 5");
		}
		
		
		
	}

}
