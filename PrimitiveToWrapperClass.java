package com.pote.engg.wrapperclass;

public class PrimitiveToWrapperClass {

	public static void main(String[] args) {
		int a = 10;
		char b = 'B';
		float f = 10.25f;
		long l = 2345l;
		short s = 12;
		double d = 25.46;
		
		Integer modifiesInt = new Integer(a);
		Character modifieschar = new Character(b);
		Float modifiedflot = new Float(f);
		Long modifiedlong = new Long(l);
		Short modifiedshort = new Short(s);
		Double modifiedDouble = new Double(d);
		System.out.println("DataType integer :: "+ a);
		System.out.println("DataType Character :: "+ 'B');
		System.out.println("DataType  float:: "+ f);
		System.out.println("DataType  long :: "+ l);
		System.out.println("DataType  short :: "+ s);
		System.out.println("DataType double :: "+ d);



	}

}
