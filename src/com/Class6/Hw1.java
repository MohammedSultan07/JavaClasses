package com.Class6;
import java.util.Scanner;
public class Hw1 {
public static void main(String[] args) {
	Scanner kb=new Scanner(System.in);
	System.out.println("Please enter Country name");
	String country=kb.nextLine();
	String language;
	
	switch (country) {
	case"USA":
		language="English";
		break;
	case"Moldova":
		language="Romanian";
		break;
	case"Chile":
		language="Spanish";
		break;
	case"Ukraine":
		language="Ukrainian";
		break;
	case"Pakistan":
		language="Urdu";
		break;
	default:
		language="Unknwown";
}
	System.out.println("You are from "+country+" and you speak "+ language);
}
}