package com.Class6;

import java.util.Scanner;

public class Recap {
public static void main(String[] args) {
	
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter time");
	int time=kb.nextInt();
	String timeOfDay;
	
	if (time>=1 && time<=11) {
		timeOfDay="Morning";
	}else if(time>=12 && time<=15) {
		timeOfDay="Afternoon";
	}else if (time>=16 && time <=20) {
		timeOfDay="Evening";
	}else if(time>=21 && time<=24) {
		timeOfDay="Night";
	}else {
		timeOfDay="Invalid";
	}
	System.out.println(timeOfDay);
	
	//!false=true, !true=false,  default values, int=0; double=0.0, boolean=false, String=null;
	
	
	
	
}
}