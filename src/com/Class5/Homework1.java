package com.Class5;

import java.util.Scanner;

public class Homework1 {
public static void main(String[] args) {
//1).	
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter quiz score");
	int quiz=kb.nextInt();
	System.out.println("Enter midterm score");
	int midterm=kb.nextInt();
	System.out.println("Enter finals score");
	int finals=kb.nextInt();
	
	int score=((quiz+midterm+finals)/3);
	
	if (score>=90) {
		System.out.println("Grade=A");
	}else if (score>=70 && score<90) {
		System.out.println("Grade=B");
	}else if (score>=50 && score<70) {
		System.out.println("Grade=C");
	}else if(score<50) {
		System.out.println("Grade=F");
	}
	System.out.println("**************************");	
//2).	
	
	String classMode="Rain";
	if(!classMode.contentEquals("Rain")) {
		System.out.println("Online");
	}else {
		System.out.println("In class");
	}	
}
}