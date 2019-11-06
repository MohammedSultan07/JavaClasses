package com.syntax.datatypes;

import java.util.Scanner;

public class LiveChat1 {
public static void main(String[] args) {

	 //Write a program with one int value for salary and four String values for different cars
    //If you make over 50000 a year, you may buy a brand new car otherwise you should buy a used car. For those you can afford a new car there are different price ranges
    //I want anything under 70k to be Audi A5
    //I want anything under 80k to be Mercedes-Benz
    //I want anything under 90k to be Jaguar
    //I want anything under 100k to be Tesla
    // And if you make less than 60k output to read "Save up money and wait until next year"
	
	Scanner kb=new Scanner(System.in);
	System.out.println("Please eneter your salary");
	int salary=kb.nextInt();
	String car1, car2, car3,car4;
	car1="Audi A5";
	car2="Mercedez-Benz";
	car3="Jaguar";
	car4="Tesla";
	if (salary>=50000) {
		System.out.println("You may buy a brand new car");
		if (salary<70000) {
			System.out.println(car1);
		}else if(salary<80000) {
			System.out.println(car2);
		}else if (salary<90000) {
			System.out.println(car3);
		}else if(salary<100000) {
			System.out.println(car4);
		}else {
			System.out.println("Save up money and wait until next year");
		}
	}
	else {
		System.out.println("Buy a used car");
	}	
}
}