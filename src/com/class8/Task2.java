package com.class8;

public class Task2 {
public static void main(String[] args) {
	
	int sumEven=0;
	int sumOdd=0;
	for(int i=1; i<=20; i++) {
		if(i%2==0) {
			
			sumEven=i+sumEven;
		}else {
			
			sumOdd=i+sumOdd;
		}
	}
	System.out.println("Total of all even #="+sumEven);
	System.out.println("Total of all odd #="+sumOdd);
}
}