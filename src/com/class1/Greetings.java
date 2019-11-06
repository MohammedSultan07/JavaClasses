package com.class1;

import java.util.Scanner;

public class Greetings {
	public static void main (String [] args) {
//		//println vs print
//		
//		//println - prints and creates a new line
//		System.out.println("Good morning");
//		//print - just prints on the same line
//		System.out.print("Good afternoon");
//		
//		System.out.println(" Good evening");
//		
//		System.out.print("Good night");
//
//		System.out.println(" I am going to sleep");
//		int[][] a = {
//				{5,2,3,7},
//				{1,5,2,2},
//				{1,2,3,4}
//			};
			
	     //should print 10
//	int sum=0;
//	for (int i=0;i<a[2].length;i++){
//	  for (int j=0;j<a[i].length; j++)
//		sum=sum+j;
//
//	}	
//			System.out.println(sum);	
			
			
			
			
//			int[][] a = {
//					{1,1,1},
//					{1,1,1},
//					{1,1,1}
//				};
//		//should be true
//				boolean check = false;
//				for (int i = 0; i < a.length; i++) {
//					if (a.length == a[i].length){
//						check = true;
//						
//					}
//				System.out.println(check);
//				}
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter the browser name to proceed further with execution");
	     String browser = sc.nextLine(); 
		   if(browser.contentEquals("ChRoME")){
			     System.out.println("Proceed with Chrome browser");
			   }else if(browser.contentEquals("FireFOX")){
			     System.out.println("Proceed with Firefox Browser");
			   }else if(browser.contentEquals("IE")){
			     System.out.println("Proceed with the IE browser");
			   }else{
			     System.out.println("Invalid browser");
			   }
}
}