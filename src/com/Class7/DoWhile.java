package com.Class7;
public class DoWhile {
public static void main(String[] args) {
	//mostly used
	int num=10;
	while(num<=7) {
		System.out.println("Hello");
		num++;
	}
	//rarely used
	int num1=10;
	do {
		System.out.println("Bye");
		num1++;
	}while(num1<=7);
	System.out.println("++++++++++++++");
	
	int nums=20;
	do {
		System.out.println(nums);
		nums+=2;
	}while(nums<=50);

}
}
//do while loop is similar to while loop
//Code will get executed condition is true
//even if it isn't true code will get executed at least once
//    int num1=10; !.                initialize variable
//    do {
//    System.out.println("Bye"):     execute code
//    num1++;                        increment
//    }while(num1<=7);               check condition