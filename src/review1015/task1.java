package review1015;

import java.util.Scanner;

public class task1 {
public static void main(String[] args) {
//1
	int a=2;
while(a<=20) {
	System.out.println(a);
	a+=2;
}


//2

int b=5;
while(b<=25) {
	System.out.print(b+" ");
	b++;
}
System.out.println();

//3
int c=1;

while (c<=3) {
	System.out.println("Enter name");
	Scanner kb=new Scanner(System.in);
	String name=kb.nextLine();
System.out.println("Hello "+name);
c++;
}	

}
}