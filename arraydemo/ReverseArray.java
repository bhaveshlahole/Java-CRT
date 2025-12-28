package com.pote.engg.arraydemo;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int temp;
		for(int i =0,j=arr.length-1;i<j;j--,i++) {
			
			temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		for (int ele:arr) {
			System.out.println(ele);
		}

	}

}
