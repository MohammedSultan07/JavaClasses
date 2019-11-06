package com.syntax.datatypes;
public class NestedIfShit {
public static void main(String[] args) {
	
boolean sunny=true;
int temp=75;
if (sunny) {
	System.out.println("Check the temperature");
	if(temp>=80) {
		System.out.println("Go to the park");
	}else {
		System.out.println("Stay home and sudy");
	}
}else{
			System.out.println("Go to the gym");
}
}
}
