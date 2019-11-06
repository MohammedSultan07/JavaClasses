package com.syntax.datatypes;

import java.util.Scanner;

public class Operators{
public static void main(String[] args) {
	//Ex  Class notes.
    /* if number is between 1-10 -->this number is small
     * if number is between 10-100 --> this number is medium
     * if number is between 100-1000 --> this number is large
     * any other number --> is out of the range
     */
//  int num=200;
////        true AND false --> false
//  if (num>1 && num <10) {
//  System.out.println("this number is small");
//  // true AND false --> false
//  }else if (num>=10 && num<100) {
//  System.out.println("this number is medium");
//  //true AND true --> true
//  }else if (num>=100 && num <1000) {
//  System.out.println("this number is large");
//  }else {
//  System.out.println("Number is out of our the range");
//  }
	
	
//Write a program to find if a number is even or odd
//Print out  "My number must be even" or "My number must be odd"
// Must use if else
	Scanner kb=new Scanner(System.in);
	System.out.println("Please enter number");
	int num=kb.nextInt();
	if(num%2==0) {
		System.out.println("My number must be even");
	}else {
		System.out.println("My number must be odd");
	}
	
	
	
	
	
	
	
	
	
}
}