package com.Class11;

import java.util.Scanner;

public class ClassElevenReveiew {
public static void main(String[] args) {
	
	int [] array2= {2, 5, 4, 7};
	for (int i:array2) {
		System.out.println(i);
	}
	int [] arr= new int[3];
	Scanner kb=new Scanner(System.in);
	for (int i=0; i<arr.length;i++){
		arr[i]=kb.nextInt();
	}
	for (int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}