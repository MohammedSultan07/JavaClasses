package com.Class14;
public class InterviewQuestions {
public static void main(String[] args) {
	
//1)
	System.out.println("Question 1");
int a=20;
int b=30;
System.out.println(a);
System.out.println(b);
a=a+b;
a=a-b;
System.out.println(a);
b=b+a;
b=b-a;
System.out.println(b);	

String a1="hello";
String b1="world";
System.out.println("a1="+a1+" b1="+b1);
a1=a1+b1;

b1= a1.substring(0,a1.length()-b1.length());

a1=a1.substring(b1.length());

System.out.println("a1="+a1+" b1="+b1);
System.out.println("*******************");

//2)
System.out.println("Question 2");
int max=0;
int [] array= {5, 10, 15, 20};
for (int i=0;i<array.length;i++) {
	if(array[i]>max){
		max=array[i];
	}}
System.out.println(max);

int [] array1= {5, 10, 15, 20};
int min=array1[0];
for (int aa=1;aa<array1.length;aa++) {
	if(array1[aa]<min){
		min=array1[aa];
	}
}
System.out.println(min);
int [] array2= {5, 10, 15, 20};
int scnd=array2[0];
for(int ab=0;ab<array2.length;ab++) {
	if (array2[ab]<max) {
		scnd=array2[ab];
	}
}
System.out.println(scnd);

System.out.println("*******************");

//3)
System.out.println("Question 3");
String str="Hello1234 how are you";
System.out.println(str);
String str1=str.replaceAll("[^A-Za-z]","");
System.out.println(str1);
int length=str1.length();
System.out.println(length);
System.out.println("*******************");
//4)
System.out.println("Question 4");
String a11="Hey how are you";
System.out.println(a11);
System.out.println(a11.substring(4));
String def="A substring is part of the string that you can print if you dont want to print the whole string value";
int deflength=def.length();
System.out.println(deflength);
System.out.println("*******************");
//5)
System.out.println("Question 5");
String a111="Hello";
System.out.println(a111);
System.out.println(a111.replace("Hello", "olleH"));
System.out.println("*******************");
}
}