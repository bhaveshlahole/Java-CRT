package com.pote.engg.exception;

public class Calculator {
	
	 

	public void  Addition(int a, int b) {
		 System.out.println("Addition is : "+(a+b));
	 }
	 
	 

	 public void  Substraction (int a, int b) {
		 System.out.println("Substraction is : "+(a-b));
	 }
	 
	 

	 public void  Multiplicatio(int a, int b) {
		 System.out.println("Multiplicatio is : "+(a*b));
	 }
	 
	 

	 public void  Division(int a, int b) {
		 System.out.println("Division is : "+(a/b));
	 }

	public static void main(String[] args) {
//		Calculator obj = new Calculator();
//		obj.Addition(10,20);
//		obj.Substraction(30,10);
//		obj.Multiplicatio(25,30);
//		obj.Division(60, 10);
		
		int firstnumber = Integer.parseInt(args[0]);
		int secondnumber = Integer.parseInt(args[1]);
		 System.out.println(firstnumber+"\t"+secondnumber);
		Calculator obj = new Calculator();
		
		obj.Addition(firstnumber,secondnumber);
	    obj.Substraction(firstnumber,secondnumber);
		obj.Multiplicatio(firstnumber,secondnumber);
		obj.Division(firstnumber, secondnumber);
	}

}

  