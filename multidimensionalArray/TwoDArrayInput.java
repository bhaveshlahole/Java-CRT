package com.pote.engg.multidimensionalArray;

public class TwoDArrayInput {

	public static void main(String[] args) {
		char arr[][] = new char [5][5];
		
		arr[0][0]='A'; 
		arr[0][1]='B'; 
		arr[1][0]='B';
		arr[1][1]='A'; 
		arr[1][2]='C';
		arr[2][0]='A';
		arr[3][0]='A';
		arr[3][1]='B';
		arr[3][2]='A';
		arr[3][3]='C';
		arr[3][4]='D';
		arr[4][0]='A';
		arr[4][1]='B';
		arr[4][2]='C';
		arr[4][3]='D';
     
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr.length;j++) {
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
	}

}
