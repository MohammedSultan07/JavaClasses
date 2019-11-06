package com.Class4;

import java.util.Scanner;

public class ScannerExample {
public static void main(String[] args) {
//Scanner is a class in Java that will allow us to take input from a user
//Scanner will help make our program more interactive
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter any number");
	/*nextInt(); for numbers
	 * nextLine(); for Strings 
	 * nextDouble(); for double
	 */
	int num=scan.nextInt();
	System.out.println("entered number is "+num);
	
	System.out.println("__________________________________");
	
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your name");
	String name=input.nextLine();
	System.out.println("Good Afternoon "+name);
	
	
}
}