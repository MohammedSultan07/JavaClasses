package com.Class3;

public class RelationalOperators {

	public static void main(String[] args) {
		
		int num1=20;
		int num2=19;

		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("**************");
		
		double d=1.99;
		double d1=2.99;
		
		boolean b=d>d1;
		System.out.println(b);
		
		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		int a=20;
		int c=20;
		//if number a is bigger than number b
		//I want to print a is larger than b
		if (a>c) {
			System.out.println("a is larger than b");
		}
		else { System.out.println("a is smaller than b");
		}
		
		int expectedHours=15;
		int actualHours=2;
		//if actual hours greater than actual, you will succeed
		//otherwise, please study more
		
		if (expectedHours<actualHours) {
			System.out.println("you will succeed");}
		else {
			System.out.println("please study more");
		}
		
		double teaPrice=4.99;
		double allowedPrice=3.99;
		teaPrice-=2;
		
		if (teaPrice<=allowedPrice) {
			System.out.println("I will buy");}
		else {
			System.out.println("i cant buy");
		}
		
		System.out.println("I keep writing some code");
			}
	}
