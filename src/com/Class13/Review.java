package com.Class13;
public class Review {
public static void main(String[] args) {
	
	String str1="Hello";
	String str2="Hello";
	
	String str3=new String("Bye");
	String str4=new String("Bye");
	
	System.out.println(str1.contentEquals(str2));
	//== sign compares and checks if it is comparing to the same object, same id etc
	String a="Hel";
	String b="lo";
	String c="Hello";
	String d="    hey   ";
	System.out.println((a+b).contentEquals(c));// checking for same content
	System.out.println(((a+b)==c));//different id because == method checks for id
	System.out.println(str1.contains("He"));
	System.out.println(a.startsWith("He"));
	System.out.println(a.endsWith("el"));
	System.out.println(d.trim());
	System.out.println(a.indexOf('e'));
}
}