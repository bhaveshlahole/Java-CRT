package com.pote.engg.loops;

public class AttendenceMgmt {

	public static void main(String[] args) {
		for(int i = 1;i<=6;i++)
		{
			System.out.println("Number of days");
			for(int j = 1; j<=2;j++) {
				
				if(j==1)
				{
					System.out.println("Day "+i+"FirstHalf");
				}
				else
				{
					System.out.println("Day "+i+"SecondtHalf");
				}
			}
		}

	}

}
