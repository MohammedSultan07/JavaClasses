package com.Class6;

import java.util.Scanner;

public class ScannerSwitch {
public static void main(String[] args) {
	
	Scanner kb=new Scanner(System.in);
	String country, food;
	System.out.println("Please enter your country");
	country=kb.nextLine();
	switch(country) {
	case "Pakistan":
		food="Biryani";
		break;
		default:
			food="unknwown";
	}
	
System.out.println("you are from "+country+" and your favorite food is "+food);
}
}