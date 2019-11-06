package com.Class11;
public class Recap {
public static void main(String[] args) {
	int[] numbersList= {2,3,5,7};
	for (int element:numbersList) {
		System.out.println(element);
	}
	String [] cars= {"BMW","Mercedes","Jaguar","STI","Honda","Toyota"};
	for (int i=0; i<cars.length;i++) {
		System.out.println(cars[i]);
	}
	int [] numbers= {1,2,3,4,5};
	int sum=0;
	for (int i=0; i<numbers.length;i++) {
		
			sum=sum+numbers[i];
		}
		System.out.println(sum);
	int arr[]= new int [3];	
	
}
}