package com.pote.engg.arraydemo;

public class AdditionOfArrayElement {

	public static void main(String[] args) {
		int [] arr = {10,40,60,70,80,100,4,1,2};
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			int temp = arr[i];
			while(temp>0){
				int rem = 0;
				rem = temp%10;
				temp=temp/10;
				sum=sum+rem;
				
			}
			
		}System.out.println("sum is :: "+sum);

			}

}
