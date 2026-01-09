package com.pote.engg.conditional;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the floor number");
		int floor = scr.nextInt();
		//int floor = 3;
		switch(floor) {
		
		case 0:
			System.out.println("Ground floor");
			break;
			
		case 1:
			System.out.println("First floor");
			break;
		
		case 2:
			System.out.println("Second floor");
			break;
		case 3:
			System.out.println("Third floor");
			break;
		case 4:
			System.out.println("forth  floor");
			break;
			
			default:
				System.out.println("The floor is not exixt");
			
		}

	}

}
