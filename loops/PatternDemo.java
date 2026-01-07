package com.pote.engg.loops;

public class PatternDemo {

	public static void main(String[] args) {
		PatternDemo patternDemoObj = new PatternDemo();
		 patternDemoObj.pattern1();
		 patternDemoObj.pattern2();
		 patternDemoObj.pattern3();

	}
	public void pattern1()
	{
for(int i =0;i<=3;i++) {
			
			System.out.println("");
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
		}
	}
	public void pattern2()
	{
	
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
	public void pattern3()
	{
		
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
