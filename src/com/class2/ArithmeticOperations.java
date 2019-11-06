package com.class2;

public class ArithmeticOperations {
	
	public static void main(String [] args) {
			
		/*
		 * declare two variables and initialize them
		 * display result of addition, subtraction, multiplication and division
		 */
		
		int num1, num2;
		num1=20;
		num2=10;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		//how can we print he value of num1 and num2 together
		
		System.out.println(num1+", "+num2);
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
		//the addition of two numbers is_
		
		//System.out.println("The addition of two numbers is "+sum);
		//System.out.println("The subtraction of two numbers is "+sub);
		//System.out.println("The multiplication of two numbers is "+mult);
		//System.out.println("The division of two numbers is "+div);
		
		//1.
		
		double num01, num02;
		num01=2.2;
		num02=1.1;
		
		double sum1=num01+num02;
		double sub1=num01-num02;
		double mult1=num01*num02;
		double div1=num01/num02;
		
		System.out.println("The addition of 2 numbers "+num01+" and "+num02+" is equal to "+sum1);
		System.out.println("The subtraction of 2 numbers "+num01+" and "+num02+" is equal to "+sub1);
		System.out.println("The multiplication of 2 numbers "+num01+" and "+num02+" is equal to "+mult1);
		System.out.println("The division of 2 numbers"+num01+" and "+num02+" is equal to "+div1);
		
		//2.
		
		double num00=3.9;
		double square=num00*num00;
		
		System.out.println("The square of "+num00+" is "+square);
		
		//3.
		
		int w, h;
		w=5;
		h=8;
		
		int perimeter=w+w+h+h;
		int area=w*h;
		
		System.out.println("The perimiter of a rectangle with width "+w+" and height "+h+" is equal to "+perimeter+", and the area is "+area);
		
		String message= "The perimiter of a rectangle with width \"+w+\" and height \"+h+\" is equal to \"+perimeter+\", and the area is \"+area";
		
		System.out.println(message);
		
		
	
		
				
	}
}