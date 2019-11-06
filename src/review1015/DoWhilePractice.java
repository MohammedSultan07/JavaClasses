package review1015;

import java.util.Scanner;

public class DoWhilePractice {
public static void main(String[] args) {
	
//	int num = 10;
//	while (num <= 7) {
//	System.out.println("Hello");
//	num++;
//	}
//	// rare
//	int num1 = 10;
//	do {
//	System.out.println("Bye");
//	num1++;
//	} while (num1 <= 7);
//	System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
//	// print even numbers from 20 to 50 using do while
//	// 1 way
//	int even = 20;
//	do {
//	System.out.println(even);
//	even += 2;
//	} while (even <= 50);
//	System.out.println("-------------Second way---------");
//	// 2 way
//	int even1 = 20;
//	do {
//	if (even1 % 2 == 0) {
//	System.out.println(even1);
//	}
//	even1++;
//	} while (even1 <= 50);	
	int a=0;
	do {
		System.out.println(a);
		a+=3;
	}while(a<=15);
	
	Scanner kb=new Scanner(System.in);
	int price;
	do {
		System.out.println("Enter price");
		price=kb.nextInt();
	}while(price!=3);
	System.out.println("enjoy your candy");
	
}
}