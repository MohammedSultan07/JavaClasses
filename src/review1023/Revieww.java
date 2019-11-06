package review1023;
public class Revieww {
public static void main(String[] args) {
	for(int i=1; i<=5;i++) {
	//System.out.print(i);
	for(int a=1; a<=i;a++) {
		System.out.print(2*a-1);
		System.out.println(a*a);
	}
	System.out.println();
	}
	//code

	        for (int floor = 1; floor <= 4; floor++) {
	            System.out.print("Floor " + floor + " -> ");
	            for (int room = 1; room <= 6; room++) {
	                System.out.print(floor + "." + room + " ");
	            }
	            System.out.println();
	        }
//pyramid
	        // funny way
//	      System.out.println("1");
//	      System.out.println("12");
//	      System.out.println("123");
//	      System.out.println("1234");
//	      System.out.println("12345");
//	      System.out.println("--------------");
	        // serious way
	        for (int row = 1; row <= 5; row++) {
	            for (int col = 1; col <= row; col++) {
	                System.out.print(col * col + " ");
	            }
	            System.out.println();
	        }
//space pyramid
//	     for (int i=1; i<=5; i++)  {
//	    	
//	    	 for (int j=5-i; j>=1; j--) {
//	    		 System.out.println(" ");
//	    	 }
//	    		 for (int m=1; m<=i; m++) {
//	    		 System.out.print(m);
//	    	 }
//	    	 System.out.println();
//	     }
	        
	     //     1
	     //    12
	     //   123
	     //  1234
	     // 12345
	  
	         
	         for (int i = 1; i <= 5; i++) {
	             for (int j = 5 - i; j >= 1; j--) {
	                 System.out.print(" ");
	             }
	             for (int m = 1; m <= i; m++) {
	                 System.out.print(m);
	             }
	             System.out.println();
	         }
	     }
	   
	        
	        
        
	        
	        
}
