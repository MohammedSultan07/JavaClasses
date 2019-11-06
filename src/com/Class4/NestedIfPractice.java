package com.Class4;

public class NestedIfPractice {
	public static void main(String[] args) {
		boolean isFriday = false;
		int day = 14;

		if (isFriday) {
			System.out.println("Today is Friday");
			if (day == 13) {
				System.out.println("I wanna watch scary movies");
			}
		} else {
			System.out.println("It is not Friday");
		}

		int age = 55;
		if (age < 16) {
			System.out.println("you are too young to drive");
		} else {
			System.out.println("you are eligible to drive");
			if (age >= 18) {
				System.out.println("you can drive alone");
			} else {
				System.out.println("you need your parents to drive");
			}
		}
		System.out.println("---------------------------------------------------");
		/*
		 * we need to check if student completed the quiz if yes, good job, if no, not
		 * good if completed check score: if more than 90, you got an A if more than 80,
		 * you got a B anything below, you should study more
		 */
		boolean quiz = true;
		int score = 77;

		if (quiz) {
			System.out.println("good job");
			if (score >= 90)
				System.out.println("You got an A");
			else if (score > 80)
				System.out.println("You got a B");
			else {
				System.out.println("You should study more");
			}
		} else {
			System.out.println("not good");
		}
	}
}