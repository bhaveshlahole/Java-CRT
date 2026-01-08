package com.pote.engg.multidimensionalArray;

public class TwoDArraysDemo {

	public static void main(String[] args) {
			int arr [][] = new int [2][3];
			 arr[1][1] = 10;
			 for(int i=0;i<arr.length;i++) {
				 
				 for(int j=0;j<arr.length;j++) {
					 System.out.println( " "+arr[i][j]+"\t");
				 }
				 
				 System.out.println();
			 }
			
			
	}

}
