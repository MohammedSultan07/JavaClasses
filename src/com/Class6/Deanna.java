package com.Class6;

import java.util.Scanner;

public class Deanna {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean thirsty = scan.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean sleepy = scan.nextBoolean();
        String drink=null;
        if (!thirsty && !sleepy) {
            drink = "Water";
        } else if (thirsty && sleepy) {
            drink = "Coffee";
        } else if (!thirsty && sleepy) {
            drink = "Tea";
        } else {
            drink = "Nothing";
        }
        System.out.println("Looks like you need " + drink);
    }
}




