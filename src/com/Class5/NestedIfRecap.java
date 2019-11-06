package com.Class5;
public class NestedIfRecap {
public static void main(String[] args) {
	
	boolean isDisplayed=true;
	String buttonText="Sign in";
	
	if (isDisplayed) {
		System.out.println("Button is displayed");
	if(buttonText.contentEquals("Sign in")) {
		System.out.println("Test case pass");
	}else {
		System.out.println("Test case failed");
	}
	}else {
		System.out.println("button is not displayed");
	}	
}
}