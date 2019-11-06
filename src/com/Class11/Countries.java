package com.Class11;

import java.util.Arrays;

public class Countries {
public static void main(String[] args) {
//	String [] countries= {"Usa","Egypt","Canada"};
//	for (String getCountries: countries) {
//		if (getCountries.equals("Usa")){
//			System.out.println("The capital");
//		}
	
	String [] actualName= {"Diana","KOKOKorina","J"};
	String [] expectedName= {"J","Diana","KOKOKorina"};
	Arrays.sort(actualName);
	
	String actual=Arrays.toString(actualName);
	Arrays.sort(expectedName);
	String expected=Arrays.toString(expectedName);
	
	System.out.println(actual.contentEquals(expected));
	
	
	String firstName="Ali";
	String firstName2="Mo";
	String firstName3="Mo";
	String firstName4="Ali";
	
	String act=firstName+firstName2;
	String exp=firstName3+firstName4;

	
	System.out.println(act);
	System.out.println(exp);
	System.out.println(act.contentEquals(exp));
	
	int [] numbers= {122,34,55,66,99};
	Arrays.sort(numbers);
	for (int i:numbers) {
		System.out.println(i+" ");
	}
	
	
	
}
}
