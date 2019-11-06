package com.Class5;

public class LogicalNot {
public static void main(String[] args) {
	boolean b1=!true;
	boolean b2=!false;
	System.out.println(b1);
	System.out.println(b2);
	boolean traffic=true;
	if (!traffic) {// we are reverting condition{
		System.out.println("On time");
	}else {
		System.out.println("Late");
	}
	
	boolean isRain= false;
	if(!isRain) {
		System.out.println("Take it");
	}else {
		System.out.println("Dont take");
	}
		///////////////////////////////
	int num1=10;
	int num2=10;
	if (num1==num2) {
		System.out.println("Numbers are equal");
	}else {
		System.out.println("numbers are not equal");
	}
	if (!(num1==num2)) {
		System.out.println("not equal");
	}else {
		System.out.println("Numbers are equal");
	}
	////////////////////////////////////////
	String name="Marry";
	String name2="Anna";
	if (! (name.equals("Marry") || name.equals("Anna"))){
		System.out.println("You are adopted");
	}else {
		System.out.println("Youre not adopted");
	}
}
}
