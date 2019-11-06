package com.Class9;
public class Pyramid {
public static void main(String[] args) {
	
	for (int i=1; i<=10; i++) {
		for (int j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	for (int i=1; i<=10; i++) {
		for (int j=i; j<10; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int i=1; i<10; i++) {
		for(int j=1; j<=i;j++){
			System.out.print(i);
		}
		System.out.println();
	}
	
	for(int i=9; i>=1; i--) {
		for(int j=i; j>=1;j--){
			System.out.print(i);
		}
		System.out.println();
	}
//	for (int i = 1; i <= 5; i++) {
//	       for (int j = 1; j <= 10; j++) {
//	      System.out.print((i * j) + " "); }
//
//	    System.out.println(); }
	
}
}