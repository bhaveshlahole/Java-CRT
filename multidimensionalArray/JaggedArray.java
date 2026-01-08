package com.pote.engg.multidimensionalArray;

public class JaggedArray {

	public static void main(String[] args) {
		char JaggedAr[][] = new char [5][5];
		JaggedAr[0]=new char[2];
		JaggedAr[1]=new char[3];
		JaggedAr[2]=new char[1];
		JaggedAr[3]=new char[5];
		JaggedAr[4]=new char[4];
		
		
		JaggedAr[0][0]='A'; 
		JaggedAr[0][1]='B'; 
		JaggedAr[1][0]='B';
		JaggedAr[1][1]='A'; 
		JaggedAr[1][2]='C';
		JaggedAr[2][0]='A';
		JaggedAr[3][0]='A';
		JaggedAr[3][1]='B';
		JaggedAr[3][2]='A';
		JaggedAr[3][3]='C';
		JaggedAr[3][4]='D';
		JaggedAr[4][0]='A';
		JaggedAr[4][1]='B';
		JaggedAr[4][2]='C';
		JaggedAr[4][3]='D';
		

		for(int i=0;i<JaggedAr.length;i++) {
			for(int j=0;j<JaggedAr.length;j++) {
				System.out.print(JaggedAr[i][j]+" ");
			}
			System.out.println();

		
	}

	}
}
