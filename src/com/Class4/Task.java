package com.Class4;

import java.util.Scanner;

public class Task {
public static void main(String[] args) {
	
	//1.
	
Scanner keyboard =new Scanner(System.in);
System.out.println("Please enter amount");
int amount1= keyboard.nextInt();
if (amount1>=200000) {
	System.out.println("loan is rejected");
}else {
	System.out.println("loan amount is "+amount1);
}
System.out.println("___________________________");

	//2.

System.out.println("please enter age");
int age= keyboard.nextInt();
if (age>=18) {
	System.out.println("You are issued a license");
}else {
	System.out.println("You are issued a learners permit");
}
System.out.println("____________________________");

	//3.

System.out.println("Enter Temperature in Farenheit");
int temp= keyboard.nextInt();
System.out.println("Enter your city Name");
String city= keyboard.next();
int newTemp=(temp-32)*5/9;
System.out.println("Temperature in "+city+" is "+newTemp);
}
}