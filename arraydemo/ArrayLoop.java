package com.pote.engg.arraydemo;

public class ArrayLoop {

	public static void main(String[] args) {
		int array[]=new int[5];
		
		System.out.println("Length is ::"+array.length);
		
		for(int index=0;index<array.length;index++) {
			array[index]=10;
			
			//System.out.println(index);
		}
		for(int ele :array) {
			System.out.println(ele);
		}

	}

}
