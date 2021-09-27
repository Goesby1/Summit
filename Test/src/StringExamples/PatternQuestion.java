package StringExamples;

public class PatternQuestion {
	
	public static void main (String [] args) {
		
		
		for (int i = 0; i <= 7; i++) {
			for (int x = 0;  x <  7; x++) {
				if (x < (7 - i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			for (int x = 7; x > 0; x--) {
				if ( x > (7 - i) ) {
					System.out.print(" ");
				} else {
					System.out.print("*");

				}
			}
			
			System.out.println();
			
		}
	}

}
