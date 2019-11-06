package com.Class6;

import java.util.Scanner;

public class Task {
public static void main(String[] args) {
	Scanner kb=new Scanner (System.in);
	System.out.println("Please enter month");
	String month=kb.nextLine();
	String season;
	if (month.contentEquals("January")||month.contentEquals("February")||month.contentEquals("December")) {
		season="Winter";
	}else if (month.contentEquals("March")||month.contentEquals("April")||month.contentEquals("May")) {
		season="Spring";
	}else if (month.contentEquals("June")||month.contentEquals("July")||month.contentEquals("August")) {
		season="Summer";
	}else if(month.contentEquals("September")||month.contentEquals("October")||month.contentEquals("November")) {
		season="Fall";
	}else {
		season="Unknown";
	}
	System.out.println("You were born in "+season);	
}
}