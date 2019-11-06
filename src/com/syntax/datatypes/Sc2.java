package com.syntax.datatypes;

import java.util.Scanner;

public class Sc2 {
public static void main(String[] args) {
	//Write a program to found out the user level of experience
    // Must use a switch statement with  a String variable named levelString and a int variable named level
    // Beginner level should be 1
    // Intermediate level should be 2
    // Expert level should be 3
	Scanner kb=new Scanner(System.in);
	System.out.println("Please enter level");
	int level=kb.nextInt();
	String levelString=null;
	switch(level) {
	case 1:
		levelString="Beginnner";
		break;
	case 2:
		levelString="Intermediate";
		break;
	case 3:
		levelString="Expert";
	break;
	default:
		levelString="Invalid";
	}	
	System.out.println("Your experience level is "+levelString);
}
}