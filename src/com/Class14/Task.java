package com.Class14;
public class Task {
public static void main(String[] args) {
//1.
	
	String str="Hello how are you?";
	System.out.println(str.replaceAll(" ", ""));
	System.out.println("---------------------");
//2..

	String str1="Syntax 123 !!!";
	String str11=str1.replaceAll("[^A-Za-z]"," ");
	System.out.println(str11);
	System.out.println("---------------------");
	int length=str1.length();
	System.out.println(length);
//3...
	String a="Is it Saturday? Is it raining? Do we have Java class today?";
	String [] array=a.split("\\?");
	System.out.println("There are "+array.length+" sentences");
}
}