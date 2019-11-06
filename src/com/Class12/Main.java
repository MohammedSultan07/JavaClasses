package com.Class12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		   Scanner kb=new Scanner(System.in);
		    System.out.println("Enter the word");
		    String name=kb.nextLine();
		    System.out.println("The first 3 letters of "+name+" is "+name.indexOf(0,2));
		
		
}	  
}		
