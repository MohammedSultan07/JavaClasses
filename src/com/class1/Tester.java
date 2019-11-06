package com.class1;

import java.util.Scanner;

public class Tester {
	
	public static void main (String [] args) {
		//This is my second Java Program
//		System.out.println("I am a Java Programmer");
//	    Scanner kb=new Scanner(System.in);
//	    System.out.println("Enter the word");
//	    String name=kb.nextLine();
//	    System.out.println("The first 3 letters of "+name+" is"+name.substring(0,3));
		
//	    Scanner sc = new Scanner(System.in); 
//	    System.out.println("Enter the browser name to proceed further with execution");
//	     String browser = sc.nextLine();
//		 String chrome1="Proceed with Chrome browser";
//		   String firefox1="Proceed with Firefox browser";
//		   String IE1="Proceed with IE browser";
//		   String output1="Chrome";
//		   String output2="Firefox";
//		   String output3="IE";
//		
//		   if(browser.equalsIgnoreCase(output1)){
//		     System.out.println(chrome1);
//		   }else if(browser.equalsIgnoreCase(output2)){
//		     System.out.println(firefox1);
//		   }else if(browser.equalsIgnoreCase(output3)){
//		     System.out.println(IE1);
//		   }else{
//		     System.out.println("Invalid browser");
//		   }
		
	    String str1="Welcome To Syntax Solutions" ;
	    char[] a= str1.toCharArray();	
		for (char output:a ) {
			System.out.println(output);
		}
	}

}
