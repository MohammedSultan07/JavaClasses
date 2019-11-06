package com.class8;

import java.util.Scanner;

public class Task3 {
public static void main(String[] args) {
	
	for (int i=1; i<=50; i++) {
		if(i%3==0){
			continue;
		}
		System.out.println(i);
	}
	System.out.println();
	
	Scanner kb=new Scanner(System.in);
	
	
	for (int i=1; i<=10; i++) {
	System.out.println("Will you apply for credit card?");
		String answer=kb.nextLine();	
		if(answer.equalsIgnoreCase("Yes")) {
			break;
		}
		
	}
	
}
}
//YOU HAVE TO PUT QUESTION AND SCANNER IN THE LOOP OTHERWISE ITS GONNA PRINT ONCE
//if(condition){
//	if(condition){
//		code;
//	}
//}

/*for (int i=1; i<=3; i++){
 * System.out.Println(i);
 * 
 * for(int y=1; y<=3; y++){
 * System.out.println(y);
 * }
 * }
 * 
 * 1->i
 * 1->y
 * 2->y
 * 3->y
 * 2->i
 * 1->y
 * 2->y
 * 3->y
 * 3->i
 */
