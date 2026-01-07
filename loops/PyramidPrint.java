package com.pote.engg.loops;

public class PyramidPrint {

	public static void main(String[] args) {
for(int i =1;i<=4;i++) {
			
			// System.out.println("");
			for(int j=1; j<=i;j++){
				if(i%2 !=0)
				{
					System.out.print("* ");
				}
				else
					{
					System.out.print("1 ");
					}
			}
		
           System.out.println();
}

	}

}
