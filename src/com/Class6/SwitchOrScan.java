package com.Class6;

import java.util.Scanner;

public class SwitchOrScan {
public static void main(String[] args) {
	Scanner kb=new Scanner(System.in);
	System.out.println("Please enter your Gender: M or F");
	char gender=kb.next().charAt(0);
	String ug;
	switch(gender) {
	case'M':
		ug="Male";
	break;
	case'F':
		ug="Female";
	break;
	default:
		ug="Invlaid";
	}	
	System.out.println("Your Gender is "+ug);
}
}