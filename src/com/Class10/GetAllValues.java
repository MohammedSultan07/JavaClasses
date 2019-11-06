package com.Class10;
public class GetAllValues {
public static void main(String[] args) {
	
	String[] animals={"Lion","Leopard","Tiger","Jaguar"};
	//I want to print all values for array
	//when its lions < I love Lion
	for (int i=0; i<animals.length;i++) {
		if(animals[i].equals("Lion")) {
			System.out.println("I love Lions");
		}else {
			System.out.println(animals[i]);
		}
	}
	System.out.println();
//Create an array of countries. While retrieving all values
//from an array print capital for each country.

	String[] countries= {"Pakistan","Egypt","USA"};
	for (int i=0; i<countries.length;i++ ) {
		if(countries[i].equals("Pakistan")) {
			System.out.println("Islamabad");
		}else if(countries[i].equals("Egypt")) {
			System.out.println("Cairo");
		}else if(countries[i].equals("USA")) {
			System.out.println("DC");
	}
	}
	System.out.println();
	System.out.println();
	
	String[] countries1= {"Pakistan","Egypt","USA"};
	String capital=null;
	for (int i=0;i < countries1.length;i++) {
		switch(countries[i]) {
		case "Pakistan":
			capital="Islamabad";
		break;
		case "Egypt":
			capital="Cairo";
			break;
		case "USA":
			capital="NY";
			break;
		}
	}
	//2D arrays, advanced for loops
	  int numbers []={45, 78, 12, 67, 55, 89, 23, 77, 88};
	  for(int a=1; a<numbers.length; a+=3) {
	System.out.println(a/numbers[a]);
	  }   
	
}
}
