package com.Class7;
import java.util.Scanner;
public class HomeWork {
public static void main(String[] args) {
//ask user to pay for coffee
//keep asking user to pay for it until entered price is equal to $5;
//after user paid then say "Enjoy your Iced coffee";
//else pay for your coffee
	//1st way with do while loop
	Scanner kb=new Scanner(System.in);
	int price;
	do {
		
		System.out.println("Please pay for your Iced coffee");
		price=kb.nextInt();
	}while(price!=5);
	System.out.println("Enjoy your Iced coffee");
	
	System.out.println("                       ");
	
	//2nd way with while loop
	int price1;
	System.out.println("Please pay for your coffee");
	price1=kb.nextInt();
	
	while(price1!=5) {
		System.out.println("Please pay for your coffee");
		price1=kb.nextInt();	
	}
	System.out.println("Enjoy your iced coffee");
	//if we don't know how many times i have to repeat the code, 
	//while loop is the best choice
}
}