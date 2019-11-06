package com.Class3;

public class IfElseIf {

	public static void main(String[] args) {

		int num1=10;
		int num2=100;
		
		if(num1>num2) {
			System.out.println("num1 is larger than num2");
		}
		else if (num1==num2) {
			System.out.println("num1 is eqaul to num2");
		}
		else {
			System.out.println("num1 is smaller than num2");
		}	
		
		int day=6;
		if (day==1) {
			System.out.println("today is Monday");
		}
		else if (day==2) {
			System.out.println("today is Tuesday");
		}
		else if (day==3){
			System.out.println("tiday is Wednesday");
		}
		else if(day==4) {
			System.out.println("today is Thursday");
		}
		else if (day==5 ) {
			System.out.println("today is Friday");
		}
		else if (day==6) {
			System.out.println("today is Saturday");
		}
		else if (day==7) {
			System.out.println("today is Sunday");
		}
		else {
			System.out.println("Idk this day");
			
			System.out.println("im done with this statement");
		}
	}
}