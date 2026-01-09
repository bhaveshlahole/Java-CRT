package com.pote.engg.conditional;

public class NestedIfElse {

	public static void main(String[] args) {
		boolean checkparentCondition = true;
		boolean checkchildCondition = false;
		
		if(checkparentCondition) {
			System.out.println("Inside the true parent condition");
		}
		 if(checkchildCondition) {
			System.out.println("Inside the true child condition");
		}
		else {
			
			System.out.println("Inside the false child condition");
		}
		
		  
	}

}
