package com.Class5;

public class HomeWork2 {
public static void main(String[] args) {
	//if true and true= true
	//if true and false= false 
	//if false and true= false
	//if false and false= false
	//if true or true= true
	//if true or false= true
	//if false or true= true
	//if false or false= false
	/*if number is between 1, 10, number is small
	 * if number is between 10, 100 number is medium
	 * if number is between 100, 1000 number is large
	 * any other number is out of range
	 */
	
	int num=2000;
	if(num>1 && num<10) {
		System.out.println("Small number");
	}else if(num>=10 && num<100) {
		System.out.println("Medium number");
	}else if (num>=100 && num<1000) {
		System.out.println("Large number");
	}else {
		System.out.println("number is out of range");
	}
	
	
	
	
	
	
}
}
