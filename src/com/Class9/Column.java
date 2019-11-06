package com.Class9;

public class Column {
public static void main(String[] args) {
	for(int i=1; i<6; i++) {
		for (int y=1; y<10; y++) {
			System.out.print(y+"|");
	}
		System.out.println();
	}
	
	for(int i=1; i<5; i++) {
		for (int y=5; y>0; y--) {
			System.out.print(y+"|");
	}
		System.out.println();
	}
		//1   	  //2 5 8	//4 7 10
	for (int i=5; i>0;i--) {
		//3 6 9
		for (int y=5; y>0; y--) {
			System.out.print(i);
		}
		System.out.println();
	}
//Numbers of columns cannot exceed number of rows. Columns have a dependency on the rows
//Numbers of columns can be less than or equal to number of rows
	
	System.out.println();
	
	
	
	
	
}
}

