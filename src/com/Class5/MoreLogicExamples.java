package com.Class5;

import java.util.Scanner;

public class MoreLogicExamples {
	public static void main(String[] args) {
		
		Scanner scan;
		double salesAmount;
		double comission;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter sales amount");
		salesAmount=scan.nextDouble();
		
		if(salesAmount<100) {
			comission=salesAmount*0.1;
		}else if (salesAmount>=100 && salesAmount<200) {
			comission=salesAmount*0.2;
		}else if(salesAmount>=200 && salesAmount<=500) {
			comission=salesAmount*0.5;
		}else {
			comission=0;
		}
		System.out.println("Based on the sales you're commision is "+comission);
	}
}