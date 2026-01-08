package com.pote.engg.multidimensionalArray;

public class CharToString {

	public static void main(String[] args) {
		 String [] [] arr = {{"My","Name"},{"is","xyz"}};
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr.length;j++) {
				 System.out.print(arr[i][j]+" ");
			 }
			 //System.out.println();
		 }
	}

}
