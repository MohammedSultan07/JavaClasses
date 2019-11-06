package com.Class6;
import java.util.Scanner;
public class Hw2 {
public static void main(String[] args) {
Scanner kb=new Scanner(System.in);
System.out.println("Enter your grade");
char grade=kb.next().charAt(0);	
String explanation; 
	switch(grade)
	{
	case'A':
		explanation="Excellent";
		break;
	case'B':
		explanation="Good";
		break;
	case'C':
		explanation="Average";
		break;
	case'D':
		explanation="Bad";
		break;
	default:
		explanation="Unacceptable";
	}
	System.out.println("You entered "+grade+", which is "+explanation);
}
}