package com.syntax.datatypes;
import java.util.Scanner;
public class PraticeSwitch {
public static void main(String[] args) {
	Scanner kb=new Scanner(System.in);
	
System.out.println("Enter number of food from the menu that they want");
	int number=kb.nextInt();
	String food=null;
	
	switch(number) {
	case 1:
		food="Big Mac";
		break;
	case 2:
		food="Fish Filet";
		break;
	case 3:
		food="fries";
		break;
	case 4:
		food="Chicken nugget";
		break;
	case 5:
		food="Mocha Frappe";
	break;
	default:
		food="Invalid input";
	}
	System.out.println("You chose "+food);
}
}