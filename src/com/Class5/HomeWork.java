package com.Class5;

import java.util.Scanner;

public class HomeWork {
public static void main(String[]args) {
	Scanner kb=new Scanner(System.in);
	System.out.println("Do you have a credit card?");
	boolean cc=kb.nextBoolean();
	
	if(cc) {
		System.out.println("Whats the balance on your card?");
		int balance=kb.nextInt();
		if (balance>1000) {
			System.out.println("Please pay off your balance");
		}else {
			System.out.println("Spend more money");
		}
	}else {
		System.out.println("We can offer credit card");
	}
}
}