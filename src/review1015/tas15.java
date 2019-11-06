package review1015;
public class tas15 {
public static void main(String[] args) {
	//1
	for(int i=1; i<=10; i++) {
		System.out.println(i);
	}
	System.out.println();
	//2
	for(int i=40; i>=10; i-=2) {
		System.out.println(i);
	}
	System.out.println();
	//3
	for(int i=50; i>=25; i--) {
		if(i%2==1) {
			System.out.println(i);
		}
	}
	System.out.println();
	//4
	for(int i=1; i<=100; i++) {
	if(i==45) {
		break;
	}
	System.out.println(i);
	}
	System.out.println();
	//5
	for(int i=1; i<=11; i++) {
		if(i==10) {
			continue;
		}
		System.out.println(i);
	}
	///////////////////////////////////////////////
}
}