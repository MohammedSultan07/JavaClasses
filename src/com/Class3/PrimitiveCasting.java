package com.Class3;

public class PrimitiveCasting {

	public static void main(String []args) {
	
		double d=12;
		System.out.println(d);
		
			//widening(implicit/automatic)
			//narrowing(explicit/manual)
			//(widening)byte, short, int, long, float, double
			//(narrowing)double, float, long, int, short, byte
		
		byte b=127;
		int i=b;
		
		int num=123;
		double d1=num;
		System.out.println(d1);
		
		double d2=123.56;
		int num2=(int)d2;
		System.out.println(num2);
		
		int num3=786;
		byte b1=(byte)num3;
		System.out.println(b1);
		
		
		
	}	
}