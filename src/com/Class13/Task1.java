package com.Class13;
import java.util.Scanner;
public class Task1 {
public static void main(String[] args) {
	
	Scanner kb=new Scanner(System.in);
	System.out.print("Enter your class day:: ");
	String day=kb.nextLine();
	if(day.trim().equalsIgnoreCase("Saturday")) {
		System.out.println("Saturday is your java class");
	}else if(day.trim().equalsIgnoreCase("Sunday")) {
		System.out.println("Sunday is your GIT class");
	}else if(day.trim().equalsIgnoreCase("Tuesday")) {
		System.out.println("Tuesday is yur SDLC class");
	}else if(day.trim().equalsIgnoreCase("Thursday")) {
		System.out.println("Thursday is your Manual Testing class");
	}else {
		System.err.println("No class on this day");
	}
}
}