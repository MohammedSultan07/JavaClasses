package com.Class7;
public class Increments {
public static void main(String[] args) {
	//increment ands decrement, adding or subtracting 1 from variable
	int a=10;
	a=a+1;
	a+=1;
	a++;
	System.out.println(a);
	int b=10;
	b=b-1;
	b=b-=1;
	b--;
	System.out.println(b);
	int time=8;
	if (time<12) {
		System.out.println("Good morning");//code executes 1 time
	}
	while(time<12) {
		System.out.println("Good morning");//until it becomes false
	time++;
	}	
	//I want to print  GM 5 times
	int i=0;
	while(i<5) {
		System.out.println("Good afternoon");
		i++;
	}
	System.out.println("Outside of while loop");
}
}
//Loops:
//while
//do while
//for
//advanced for loop / enhanced loop / for each loop
//----------------------
//while loop syntax
//initialize variable(should be outside of the loop)
//while (yest variable-> true){
//code;
//increment or decrement variable