package com.Class4;

public class Recap {
	public static void main(String[] args) {
		
		int num=23;
		num=90;
		num-=200;
		num-=110;
		num+=220;
		
		if (num>0) {
			System.out.println(num+" is a positive number");
		}
		else if (num==0){
			System.out.println("Value of num is "+num);
		}
		else {
			System.out.println(num+" is a negative number");
		}
	
	//even or odd
	int i=1;
	 if(i%2==0) {
		 System.out.println(i+" is an even number");
	 }
	 else {
		 System.out.println(i+" is an odd number");
	 }
	
	if (i%2!=0) {
		System.out.println(i+" is an odd number");
	}
	else {
		System.out.println(i+" is an even number");
	}
	
	int integer=8;
	if (integer%2!=0) {
		System.out.println(integer+" is an odd number");
	}
	else {
		System.out.println(integer+" is an even number");
	}
	}
}