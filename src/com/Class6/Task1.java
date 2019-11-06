package com.Class6;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	Scanner kb=new Scanner(System.in);
	System.out.println("Was there a sale?");
	boolean sale=kb.nextBoolean();
	
		double discount;
	double finalPrice;
	
	
	if(!sale){
		System.out.println("I am not shopping");
	}else {
	System.out.println("What is the actual price");
	}
	double price=kb.nextDouble();

	if(price>0 && price<20) {
		discount=price*0.1;
	}else if (price>20 && price<100) {
		discount=price*0.2;
	}else if (price>=100 && price<500) {
		discount=price*0.3;
	}else {
		discount=price*0.5;
	}
	finalPrice=price-discount;
	
	System.out.println("After discount "+discount+" the price of item reduced from "+price+" to "+finalPrice);
	
	
}
}
