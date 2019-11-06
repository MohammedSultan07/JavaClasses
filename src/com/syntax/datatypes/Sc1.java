package com.syntax.datatypes;

import java.util.Scanner;

public class Sc1 {
public static void main(String[] args) {
Scanner kb=new Scanner(System.in);
System.out.println("Enter the month number");
int num=kb.nextInt();
String output=null;
switch(num) {
case 1 :
	output="January";
	break;
case 2 :
	output="February";
	break;
case 3 :
	output="March";
	break;
case 4 :
	output="April";
	break;
case 5 :
	output="May";
	break;
case 6 :
	output="June";
	break;
case 7 :
	output="July";
	break;
case 8 :
	output="August";
	break;
case 9 :
	output="September";
	break;
case 10 :
	output="October";
	break;
case 11 :
	output="November";
	break;
case 12 :
	output="December";
	break;
default:
	output="Invalid";
}

System.out.println("We are in "+output);






}
}