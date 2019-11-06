package com.Class13;
public class StringManipulation {
public static void main(String[] args) {
	
String str="Java is getting interesting";
System.out.println(str.substring(15));
System.out.println(str.substring(8,15));

//1.
String str1="Sunday";
System.out.println(str1.replace("Sunday", "Yadnus"));

//2.
String a="Hello";
int middle=a.length()/2;
if(!a.isEmpty()) {
if(a.length()%2==1 && a.length()>=3) {
	System.out.println(a.charAt(middle));
	
}	
}
	
}	
}
