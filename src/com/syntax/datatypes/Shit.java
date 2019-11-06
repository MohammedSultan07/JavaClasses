package com.syntax.datatypes;

import java.util.Scanner;

public class Shit {
public static void main(String[] args) {
	Scanner kb=new Scanner(System.in);
	int object;
	System.out.println("Enter Number");
	object=kb.nextInt();
	if (object>=400) {
		if(object<=600) {
			System.out.println("Dont calculate commission");
		}else if(object>=600) {
			System.out.println("Value is too large");
		}}else {
			System.out.println("calculate commission");
		}
	}
}

