package com.pote.engg.arraydemo;

public class ArrayReverse {

	public static void main(String[] args) {
		int array1 [] = {10,20,30,40,50,6,7,8,9,10};
		int array2[] = new int [array1.length];
		
		for(int i=0 ;i<array1.length;i++) {
			array2[i]=array1[i];
			
		}
		
		for(int newEle:array2) {
			System.out.println(newEle);
		}
		
	}

}
