package com.pote.engg.arraydemo;

public class AverageOfArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,80,-10,-20,-30,100};
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum=sum+arr[i]/arr.length;
		}
		System.out.println("Averrage is :: "+sum );
	}

}
