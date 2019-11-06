package com.Class7;
public class WorkDay {
public static void main(String[] args) {
	boolean workDay=true;
	int day=1;
	while(workDay) {
			if(day==6||day==7) {
				System.out.println("I dont need a day off anymore");
				workDay=false;
			}else {
				System.out.println("I need a day off");
			}
			day++;
	}
}
}
