package com.class2;

public class Concatenation {
	
	public static void main(String [] args) {
		
		String name="Zain";
		//Display in console Good morning Zain
		
		System.out.println("Good morning "+name);
		
		int day =22;
		//Today is September 22
		
		System.out.println("Today is September "+ day);
		
		String text= "Today is September ";
		System.out.println(text+day);
		
		String city="Lorton";
		int phoneNumber=1234567890;
		
		String text1="My name is ";
		String text2="I live in ";
		String text3="My phone number is ";
		
		System.out.println(text1+name);
		System.out.println(text2+city);
		System.out.println(text3+phoneNumber);
		
		int num1=12;
		int num2=13;
		//The value of num1=_ and the value of num2=_
		System.out.println("The value of num1="+num1+" and the value of num2="+num2);
		
		String fruit="banana";
		char dollar='$';
		double price=1.99;
		//The price of banana is $1.99
		
		System.out.println("The price of "+fruit+" is "+dollar+price+"!!!");
		
	}
}