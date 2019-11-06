package com.class8;
import java.util.Scanner;
public class WhileExample {
public static void main(String[] args) {
	
Scanner kb=new Scanner(System.in);
boolean isRain;

do {
	System.out.println("Is it raining");
	isRain=kb.nextBoolean();
	}while(isRain);
	System.out.println("You can go to the park");

/*
 * When we know in advanced how many times we want to repeat block of code
 * Best choice will be FOR LOOP
 */
for(int i=1; i<=5; i++){
	System.out.println("Good morning");
	}	

	//print numbers 1-10

	for(int i=1; i<=10; i++) {
		System.out.println(i);
	}
	
	for(int i=10; i>=1; i--) {
		System.out.println(i);
	}	
	
	for (int i=50; i<=50; i+=5) {
		System.out.println(i);
	}
}
}