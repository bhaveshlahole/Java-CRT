package com.pote.engg.functions;

public class chocolateQuestioConstructor {
	chocolateQuestioConstructor(double a,double b){
		System.out.println("Inside the double");
	}
	chocolateQuestioConstructor(Integer a,Integer b){
		System.out.println("Inside the Integer");
	}
	chocolateQuestioConstructor(Integer a,double b){
		System.out.println("Inside the Integer-double");
	}
	

	public static void main(String[] args) {
		chocolateQuestioConstructor constructor = new chocolateQuestioConstructor(10,20);
		
	}
	
}
