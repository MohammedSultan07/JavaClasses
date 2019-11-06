package com.Class10;
public class Task123 {
public static void main(String[] args) {

	//1
	char[] grades=new char[6];
	grades[0]='A';
	grades[1]='B';
	grades[2]='C';
	grades[3]='D';
	grades[4]='E';
	grades[5]='F';
	System.out.println(grades[1]);
	
	char grades1[]= {'A','B','C','D','E','F'};
	System.out.println(grades1[1]);
	for(int i=0; i<grades1.length; i++) {
		System.out.println(grades[i]);
	}
	
	//2
	String[] names=new String[4];
	names[0]="Mo";
	names[1]="Kevin";
	names[2]="Carlos";
	names[3]="Jay";
	System.out.println(names[0]);
	
	String names1[]= {"Mo","Kevin","Carlos","Jay"};
	System.out.println(names1[0]);
	
	//3
	String [] words=new String[5];
	words[0]="Java";
	words[1]="Saturday";
	words[2]="day";
	words[3]="coding";
	words[4]="is";
	System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
	
	String words1 []= {"Java","Saturday","day","coding","is"};
	System.out.println(words1[1]+" "+words1[4]+" "+words1[0]+" "+words1[3]+" "+words1[2]);

	String[] animals={"Lion","Leopard","Tiger","Jaguar"};
	int size=animals.length;
	for(int i=0; i<size; i++) {
		System.out.print(animals[i]+" ");
	}
	System.out.println();
	
	//create an array to store 5 double values, print all in one line
	double[] val= {0.0, 1.0, 2.0, 3.0, 4.0};
	int vn=val.length;
	for(int a=0; a<vn; a++){
			System.out.print(val[a]+" ");
	}

}
}