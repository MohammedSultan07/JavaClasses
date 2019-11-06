package com.Class11;
public class TwoDArrays {
public static void main(String[] args) {
	
	//Declare 2d array
	int [][] array= new int [3][4];
	//1st row
	array[0][0]=44;
	array[0][1]=80;
	array[0][2]=33;
	array[0][3]=20;
	//2nd row
	array[1][0]=10;
	array[1][1]=5;
	array[1][2]=7;
	array[1][3]=8;
	//3rd row
	array[2][0]=10;
	array[2][1]=9;
	array[2][2]=70;
	array[2][3]=80;
	System.out.println(array[1][3]);
	//Create a 2d array of String with 2 rows and 3 columns
	String [][] name=new String[2][3];
	name[0][0]="Deannochka";
	name[0][1]="KoKoKorina";
	name[0][2]="J";
	
	
	name[1][0]="Jay";
	name[1][1]="Carlos";
	name[1][2]="Kevin";
	System.out.println(name[1][1]);
	
	//Another way
	int [][]a= {
			{8,7,5,3,8},		
			{1,5,6,4,9},
			{3,6,8,0,7}
	};
	System.out.println(a[1][4]);
	//To identify numbers if rows
	System.out.println(a.length);
	//To identify numbers of columns
	System.out.println(a[0].length);
	//2D array is an array inside an array
	
	for (int i=0; i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]*2+" ");
		}
		System.out.println();
	}
	
}
}