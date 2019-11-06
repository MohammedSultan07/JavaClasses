package com.Class6;
import java.util.Scanner;
public class Hw3 {
public static void main(String[] args) {
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter first number");
	int num1=kb.nextInt();
	System.out.println("Enter operator");
	char op=kb.next().charAt(0);
	System.out.println("Enter second number");
	int num2=kb.nextInt();
	
	if(op=='+') {
		System.out.println(num1+num2);
	}else if(op=='-') {
		System.out.println(num1-num2);
	}else if(op=='*') {
		System.out.println(num1*num2);
	}else if(op=='/') {
		System.out.println(num1/num2);
	}else {
		System.out.println("Invalid operator");
	}
}
}