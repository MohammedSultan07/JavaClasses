package com.Class14;
public class ToCharArray {
public static void main(String[] args) {
	
	//*.toCharArray converts this String to a new character array.
	String str="Syntax";
	char[] a=str.toCharArray();
	for (char i: a) {
		System.out.print(i);
	}

	//.split(); this method splits the string around matches of given regular expression
	String str1="Video provides a powerful way to help you prove your point";
	String[] array=str1.split(" ");
	for (int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	}
//	for(String i: array) {
//		System.out.println(array);
//	}
	
	//How any sentences are in the following String
	String str2="Today is Sunday. Today is a sunny day. We are having Java class ";
	String [] array2=str2.split("\\.");
	System.out.println("The number of sentences in the given String is:: "+array2.length);
	for (int c=0;c<array2.length;c++) {
		System.out.println(array2[c]);
	}
	for(String string: array2) {
		System.out.println(string.trim());
	}
	
	
	
}
}