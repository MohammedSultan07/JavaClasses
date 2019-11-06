package com.Class13;

public class RegEx {
public static void main(String[] args) {
	String str="14234Hel45645lo46546";
	System.out.println(str.replaceAll("[0-9]", ""));
	System.out.println(str.replaceAll("[^0-9]", ""));
	System.out.println(str.replaceAll("[a-zA-Z]", ""));
	
	String str2="Hi&#&How7896Are483you";
	System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
	System.out.println(str2.replaceAll("[0-9]", ""));

	String str3="12-22-1990";
	System.out.println(str3.replace('-','/'));
	System.out.println(str3.replaceFirst("-", "/"));
	System.out.println(str2.replaceAll("\\W", ""));
	System.out.println(str2.replaceAll("\\w", ""));
	
}
}
