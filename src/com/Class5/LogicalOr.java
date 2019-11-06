package com.Class5;

import java.util.Scanner;

public class LogicalOr {
public static void main(String[] args) {
//7days a week
//if days are 2 or 4, SDLC class
//if days are 6 or 7, java class
//if days are 1 or 5, no class
//if day is 3, review class
	Scanner kb=new Scanner(System.in);
	//System.out.println("Enter day number");
	//int day=kb.nextInt();
	//if(day==2 || day ==4) {
	//	//System.out.println("SDLC Class");
	//}else if (day==6 || day==7) {
		//System.out.println("Java Class");
	//}else if (day==1 || day==5) {
	//	System.out.println("No Class");
	//}else if (day==3) {
	//	System.out.println("Review Class");
	//}else {
	//	System.out.println("Invalid Input");
	//}
	System.out.println("Please enter day");
	String day1=kb.nextLine();
	if (day1.contentEquals("Tuesday") || day1.contentEquals("Thursday")){
		System.out.println("SDLC class");
	}else if(day1.contentEquals("Saturday") || day1.contentEquals("Sunday")) {
		System.out.println("Java Class");
	}else if (day1.contentEquals("Monady") || day1.contentEquals("Friday")) {
		System.out.println("No class");
	}else if(day1.contentEquals("Wednesday")) {
		System.out.println("Review class");
	}else {
		System.out.println("Invalid Input");
	}
			
	
	
	
}
}