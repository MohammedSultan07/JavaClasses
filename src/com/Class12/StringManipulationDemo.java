package com.Class12;
public class StringManipulationDemo {
public static void main(String[] args) {
	
	//String is a language and array of characters, java.lang package. String is its own class
	//Each character in String is stored in different indexes.
	//Cannot change Strings because they are immutable. Original String will stand,
	//the new String created from the original String will have the changes and edits
	
	
	//There are 2 ways to create String objects.
	//1
	//String literal. Declare variable and initialize it.

	String name="John";  
	System.out.println(name);
	//name.length();
	System.out.println(name.length());
	
	//2
	//Creating String with new key word
	String name1=new String("John1");
	
	
	/*This method returns length of this String
	 * The length is equal to the number
	 * of 16bit Uni-code characters in the String
	 */
	
	int name1Len=name.length();
	System.out.println("The length of name1Len is ="+name1Len);
	System.out.println();
	
	//String to LowerCase
	String str1="Hello woRLd";
	System.out.println("Before: "+str1);
	String newValOfstr1=str1.toLowerCase();
	System.out.println("After: "+newValOfstr1);
	
	//.equals()
	String str2="HEllo World";
	
	boolean isEqual=str1.contentEquals(str2);
	System.out.println(isEqual);
	
	//equalsIgnoreCase();
	System.out.println(str1.equalsIgnoreCase(str2));
	
	/*
	 * toUpperCase();
	 * This method converts all of the characters in
	 * this String to upper case
	 */
	
	String str3="Mohammad";
	System.out.println("Before: "+str3);
	str3=str3.toUpperCase();
	System.out.println("After: "+str3);
	
	
}
}