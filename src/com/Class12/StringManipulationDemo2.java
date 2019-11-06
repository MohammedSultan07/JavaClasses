package com.Class12;
public class StringManipulationDemo2 {
public static void main(String[] args) {
	
	int a=2;
	if(a==20) {
		System.out.println("Number is "+a);
	}else {
		System.err.println("Number was not 20 but is "+a);
	}
	/*
	 * .contains();
	 * This method searches the sequence of characters in the string.
	 * If the sequences of characters are found,
	 * then it returns true otherwise false
	 */
	System.out.println();
	
	String sentence="It was raining";
	String sen="Raining";
	System.err.println(sentence.contains(sen));
	System.out.println(sentence.contains("was"));
	
	//Create two Strings and initialize them with some value.
	//implement the following methods on those Strings.
	//sen.length();..sen.contentEquals();..sen.contains(s);..sen.toUpperCase();
	//sen.toLowerCase(); sen.equalsIgnoreCasing();
	
	String a1="It stopped raining";
	String a2="It was raining";
	
	
	System.out.println("*************");
	System.out.println("*************");
	//This method tests if a string starts with the specified  prefix beginning
	String str="It is very hot in this class";
	System.out.println("Does this String start with = "+str.startsWith("It"));
	System.out.println("Does this String start with = "+str.startsWith("It", 0));
	//This method tests if this String ends with the specified suffix
	System.out.println("Does this String end with = "+str.endsWith("class"));
	
	
}
}