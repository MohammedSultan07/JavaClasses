package com.Class14;
public class SplitMethod2 {
public static void main(String[] args) {

	//how many clause are there in the following String
	//how to separate comma delimited String
	String str="If you come to class early , then you can study more, also you can learn more, and you can leave early";
	String [] array=str.split("\\,");
	for(int i=0; i<array.length;i++) {
		System.out.println(array[i].trim());
	}
	String str1="Welcome to Syntax Technologies";
	String[] array2=str1.split(" ",2);
	System.out.println(array2.length);
	for(int i=0;i<array2.length;i++) {
		System.out.println(array2[i]);
	}
}
}