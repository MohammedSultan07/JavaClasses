package com.Class9;
import java.util.Scanner;
public class Task {
public static void main(String[] args) {
	
//Write a program that reads a range of integers (start and end point) 
//provided by a user and then from that range prints
//the sum of the even and odd integers.
Scanner kb= new Scanner(System.in);
System.out.println("Enter start");
	int start=kb.nextInt();
System.out.println("Enter end");
	int end=kb.nextInt();
	int sumEven=0;
	int sumOdd=0;
	for(int a=start; a<=end;a++) {
		if(a%2==0) {
			sumEven=sumEven+a;
		}else {
			sumOdd=sumOdd+a;
		}
	}
		System.out.println("Sum of all even numbers is = "+sumEven);
		System.out.println("Sum of all odd numbers is = "+sumOdd);
		System.out.println();

//Write a guessing game where the user has to guess a secret number 
//between 1 and 20 After every guess input, the program tells the user whether 
//their number was too large or too small. The program will keep asking the user
//to enter the number until he finds the correct number. When the correct answer
//is found the system should display “Congratulations!!. You got it!”	
	System.out.println();
	
		int secretNumber, guessNumber;
		
	secretNumber=19;
	do {
		System.out.println("Between 1-20, Guess the number loser!");
		guessNumber=kb.nextInt();
		if(guessNumber<secretNumber) {
			System.out.println("Your number is too small");
		}else if(guessNumber>secretNumber) {
			System.out.println("Your number is too big");
		}else {
			System.out.println("Congratulations!");
		}
	}while(guessNumber!=secretNumber);
	}
}