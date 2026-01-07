package com.pote.engg.loops;
public class PyramidNum {
	public static void main(String[] args) {
		int counter = 1;
		int tempcount = 1;
for(int i =1;i<=6;i++) {
	if(counter == tempcount) {
		System.out.println(i*2-1 );
		counter++;
		tempcount =1;}
		else {
			System.out.print(i*2);
			tempcount++;
		}
		
	}
}
}
