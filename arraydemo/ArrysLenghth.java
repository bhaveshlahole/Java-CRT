package com.pote.engg.arraydemo;

public class ArrysLenghth {

	public static void main(String[] args) {
		String[] arr= {"abc","xyz","pqr","opr",null};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
			try {
			System.out.println(arr[i].length());
			}catch(Exception ex) {
				System.out.println("Null pointer Exception handled");
			}
			
		}
	}

}
