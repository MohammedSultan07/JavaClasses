package com.Class4;

public class NestedIfCondition {
	public static void main(String[] args) {

		boolean diploma = true;
		double gpa = 3.9;
		if (diploma) {
			System.out.println("Congratulations");
			if (gpa >= 3.5) {
				System.out.println("you are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}
		} else {
			System.out.println("get a degree");
		}
		System.out.println("_________________________________________________________________-");

		double mortgageRate = 4.3;
		int price = 295000;

		if (mortgageRate > 4.5) {
			System.out.println("User will not buy a house");
		} else {
			System.out.println("User will consider buying");
			if (price >= 200000) {
				System.out.println("User will take out loan");
			} else {
				System.out.println("User will pay cash");
			}
		}
	}
}