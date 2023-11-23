package javaprograms;

public class DiamondPattern {

	public static void main(String[] args) {
	int number = 4;
	
	
        // Outer loop 1
        // prints the first half diamond
        for (int i = 1; i<= number; i++) {
 
            // Inner loop 1 print white spaces in between
            for ( int j= 1; j<= number - i; j++) {
                System.out.print(" ");
            }
 
            // Inner loop 2 prints star
            for (int j = 1; j <= i * 2-1; j++) {
                System.out.print("*");
            }
 
            // Ending line after each row
            System.out.println();
        }
        
        
        //outer loop 2
        for (int i = number - 1; i > 0; i--) {
        	 
            // Inner loop 1 print whitespace in between
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
 
            // Inner loop 2 print star
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
 
            // Ending line after each row
            System.out.println();
        }

	}

}
