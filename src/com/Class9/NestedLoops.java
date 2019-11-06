package com.Class9;

public class NestedLoops {
	public static void main(String[] args) {

//		for (int i = 1; i <= 3; i++) {
//			System.out.println("I am outer loop");
//
//			for (int j = 1; j <= 3; j++) {
//				System.out.println("I am inner loop");
//			}
//		}
//		System.out.println();
//
//		for (int i = 0; i <= 5; i++) {
//			System.out.println(i);
//
//			for (int j = 0; j <= 5; j++) {
//				System.out.println(i + " " + j);
//			}
//		}
//
//		// military time, 24hrs, 60minutes
//		for (int h = 00; h < 24; h++) {
//			System.out.println();
//			for (int m = 00; m < 60; m++) {
//				System.out.println(h + ":" + m);
//			}
//		}

		for (int h = 00; h < 24; h++) {
			System.out.println();
			for (int m = 0; m < 60; m++) {
				if (h < 24) 
				 if (h < 10 && m < 10) {
						System.out.println("0" + h + ":" + "0" + m);
					} else if (h<10 && m >= 10) {
						System.out.println("0" + h + ":" + m);
					}else if(h>=10 &&m<10) {
						System.out.println(h + ":0" + m);	
						}else {
							System.out.println(h+":"+m);
					
//	for(int h=00; h<12; h++) {
//		System.out.println();
//		for(int m=00; m<60; m++) {
//			System.out.println(h+":"+m);
//			for (int s=0; s<60; s++) {
//				System.out.println(h+":"+m+":"+s);
//				for(int ms=0; ms<60; ms++) {
//					System.out.println(h+":"+m+":"+s+":"+ms);
//				}
//			}
//		}
//	}

				}
			}
		}
	}
}


