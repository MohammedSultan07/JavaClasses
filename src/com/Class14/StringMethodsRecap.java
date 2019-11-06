package com.Class14;
public class StringMethodsRecap {
public static void main(String[] args) {
	
	//.replace
	String str="your Syntax Technologies. is your place to study";
	System.out.println(str.replace('y', 'i'));
	
	System.out.println("***************");
	System.out.println(str.replace("your", "My"));
	System.out.println("***************");
	
	//.replaceAll
	String str1="";
	//System.out.println(str1.replaceAll(regex, replacement));
	//System.out.println(str.replaceAll("way(.*), "")); will replace everything starting from that word
	String str2="834jbikfjo93";
	System.out.println(str2.replaceAll("[0-9]", ""));
	System.out.println(str2.replaceAll("[^0-9]", ""));
	System.out.println(str2.replaceAll("[^A-z]", ""));
	
	String str3="*^%9785hail";
	System.out.println(str3.replaceAll("[^A-Za-z]", ""));
	
	System.out.println("***************");
	//If a method gives you a boolean value it means you cannot add another method afterwards
	//System.out.println(str1.replaceAll("\\W", "")); to replace all the signs
	//System.out.println(str1.replaceAll("\\w", "")); to replace everything but the signs
}
}