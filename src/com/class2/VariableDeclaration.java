package com.class2;

public class VariableDeclaration {
	
	public static void main (String [] args) {
		
		//1.declaring variable num1,2,3 and assigning value to it
		int num1=21;
		int num2=32;
		int num3=688;
		char num4='A';
		
		//2.declare variable first and assign value later
		int n1;
		int n2;
		int n3;
		
		n1=15;
		n2=23;
		n3=47;
		
		//3.declare all variables together, assign value later
		int number1, number2, number3;
		
		number1=9;
		number2=17;
		number3=89;
		
		number3=1000;
		System.out.println(number3);
		
		boolean var=true;
		System.out.println(var);
		
		char myVariable='@';
		System.out.println(myVariable);
		
		number2=number1;
		System.out.println(number2);
		//number2=false; compiler error asking to change datatype of variable number 2 to boolean.
		
		boolean isRain=false;
		boolean isSnow;
		isSnow=isRain; //isSnow=false
		System.out.println(isSnow);
		isSnow=true;
		System.out.println(isSnow);
		/*
		 *
		 */
		
	}
}