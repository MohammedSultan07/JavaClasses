package com.class8;

public class BreakandContinue {
public static void main(String[] args) {
	for (int i=0; i<10; i++) {
		if(i==7) {
			break;
		}
		System.out.println(i);
	}
	System.out.println("I am outside of the loop");
	//continue: it will skip CURRENT iteration
	for (int i=1; i<=5; i++) {
		if (i==3||i==4){
			continue;
		}
		System.out.println(i);
	}
	
	for (int a=1; a<=20;a++) {
		if(a==5||a==6||a==7) {
		continue;
	}
	System.out.println(a);

	}	
}

/*
 * break and continue can be used in any loop
 * mostly within if statement
 * 
 * break vs continue
 * break-> exits breaks the loop
 * continue-> skips the current iteration
 */


}
//break statement simply breaks the loop