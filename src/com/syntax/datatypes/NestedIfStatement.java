package com.syntax.datatypes;

public class NestedIfStatement {

public static void main(String[] args) {

	boolean hasMoney=true;
	boolean isNearby=false;

	if(hasMoney==true) {
		if(isNearby) {
			System.out.println("I will eat in the restaurant");
		}else {
			System.out.println("cant walk long distance");
		}
	}
	
}
}