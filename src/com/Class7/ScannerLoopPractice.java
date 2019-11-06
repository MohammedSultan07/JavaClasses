package com.Class7;
import java.util.Scanner;
public class ScannerLoopPractice {
public static void main(String[] args) {
Scanner kb=new Scanner(System.in);
int i=1;
while(i<=5) {
System.out.println("Please enter name");
String name=kb.nextLine();
System.out.println("Good afternoon "+name);
i++;
}
}
}