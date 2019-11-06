package com.Class4;

public class IfElseRecap {

public static void main(String[] args) 
	{
	/*Class Schedule
	 * if tuesday= sdlc class
	 * if wed= java review
	 * thursday= sdlc class
	 * saturday= coding class
	 * sunday= favorite coding class
	 */
	
	int day=8;
	
	if (day==2) {
	System.out.println("SDLC Class");	
	}
	else if (day==3) {
		System.out.println("Java Review");
	}
	else if (day==4) {
		System.out.println("SDLC Class");
	}
	else if (day==6) {
		System.out.println("Java Class");
	}
	else if (day==7) {
		System.out.println("Java Coding class");
	}
	else {
		System.out.println("We dont have class that day");
	}
	
	//nested if 
	//if statement inside another if statement
	boolean b=false;
	boolean classToday=true;
	if(b) {
		System.out.println("Hello");
		if (classToday){
			System.out.println("Hello my friends");
		}
		else {
			System.out.println("Bye");
		}
	}
	}
}