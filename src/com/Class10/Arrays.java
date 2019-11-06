package com.Class10;
public class Arrays {
public static void main(String[] args) {
	
	int []b;//declare an array. preferred way
	int c[];//declare an array
	
	b=new int[4];//initialize
	//2nd way all in one, declaration and initializing
	int[] array=new int[4];
	array[0]=10;
	array[1]=20;
	array[2]=30;
	array[3]=40;
	//access value from an array
	System.out.println(array[2]);
	
	//lets create an array that will store classes that we have
	String[] classes= new String[4];
	classes[0]="Java";
	classes[1]="SDLC";
	classes[2]="Manual Testing";
	classes[3]="GIT";
	//today we have java class
	System.out.println("Today we have "+classes[0]+" class");
	
	int [] nums=new int[3];
	nums[0]=1;
	nums[1]=2;
	nums[2]=3;
	//how to change 1 to 100
	nums[0]=100;
	System.out.println(nums[0]);
	System.out.println(nums[1]-nums[2]);
	
	
	String[] name=new String [3];
	name[0]="Carlos";
	name[1]="Kevin";
	name[2]="JayJU";
	//name[3]="Mo";// cant go beyond the number declared in array
	System.out.println(name[2]);
	
	//if you put less values, complier will give default values
	int[] numbers=new int[4];
	numbers[1]=100;
	numbers[3]=200;
	System.out.println(numbers[0]);
	
	//int[] n=new int[2147483647];limit
	
	int[] n=new int[19];
	n[0]=12;
	n[1]=13;
	n[2]=14;
	n[3]=15;
	System.out.println(n.length);
	
	String[] a= {"Winter", "Fall", "Summer", "Spring"};
	System.out.println("I was born in "+a[3]);
	int arraySize=a.length;
	System.out.println(arraySize);
	
	
	
}
}