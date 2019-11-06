package com.Class5;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	System.out.println("Enter height in inches:");
	Scanner kb=new Scanner(System.in);
	int h=kb.nextInt();
	if (h<60) {
		System.out.println("Under 5 feet");
	}else if(h<=60 || h<=72) {
		System.out.println("5 to 6 feet");
	}else {
		System.out.println("Over 6 ft");
	}
}
}
