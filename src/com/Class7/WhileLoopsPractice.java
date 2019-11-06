package com.Class7;
public class WhileLoopsPractice {
public static void main(String[] args) {
	int i=1;
	while (i<=20) {
		System.out.println(i);
		i++;
	}
	int y=10;
	while(y<=30) {
		System.out.print(y+", ");
		y++;
	}
	System.out.println("*********************");
	int b=10;
	while(b>=1) {
		System.out.println(b);
		b--;
	}
	System.out.println("*********************");
	int c=50;
	while(c>=20) {
		System.out.println(c);
		c--;
	}
	System.out.println("*********************");
	int a=2;
	while(a<=20) {
		System.out.println(a);
		a+=2;
	}
	System.out.println("*********************");
	int q=1;
	while(q<=20) {
		System.out.println(".");
		if(q%2==0) {
			System.out.println(q);
			q++;
		}
		q++;
	}
	System.out.println("*********************");
	int e=50;
	while(e<=100) {
		if (e%2==1) {
			System.out.println(e);
		}
		e++;
	}
	System.out.println("*********************");
	int f=100;
	while (f>1) {
		System.out.println(f);
		f-=2;
	}
	System.out.println("*********************");
}
}