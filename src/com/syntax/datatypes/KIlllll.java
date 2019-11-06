package com.syntax.datatypes;

import java.util.Scanner;

public class KIlllll {
public static void main(String[] args) {
	
	Scanner kb=new Scanner(System.in);
	int num;
	System.out.println("Enter value");
	num=kb.nextInt();
	if(num%2==0) {
		System.out.println("Value is even");
		if(num>100) {
			System.out.println("Value is too large");
		}else {
			System.out.println("Value is just right");
		}
	}else {
		if(num<100){
			System.out.println("Value is just right");
		}else {
			System.out.println("This is an odd number and value is too high");
		}	
	}
	
}
}