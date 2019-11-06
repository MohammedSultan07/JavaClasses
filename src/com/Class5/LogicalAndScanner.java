package com.Class5;

import java.util.Scanner;

public class LogicalAndScanner {
//ask user to enter age and if age 1, 3 youre baby
//if age is 3 to 5, youre toddler
//if age 5 to 12, youre kid
//if 12 to 19 youre teenager
//if >20 youre adult
	
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Please enter age");
		int age=kb.nextInt();
		String human;
		if(age>=1 && age<3) {
			//System.out.println("You are a baby");
			human="baby";
		}else if(age>=3 && age<=5) {
			//System.out.println("You are a toddler");
			human="todler";
		}else if (age>=5 && age<12) {
			//System.out.println("You are a kid");
			human="kid";
		}else if(age>=12 && age<=19) {
			//System.out.println("Youre a teenager");
			human="teenager";
		}else if (age>20) {
			//System.out.println("Youre and adult");
			human="adult";
		}else {
			//System.out.println("Youre not born");
			human="unborn";
		}
		
		System.out.println("Based on your age you are "+human);
		
		
		
		
	}
	
}
