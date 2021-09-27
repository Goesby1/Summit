

import java.util.Scanner;

public class FlowControlsPatternsAvg {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		double input = -1;
		double counter = 0;
		int positive = 0;
		int negative = 0;
		double sum = 0;
		System.out.println("Enter an integer, the input ends if it is 0: ");
		
		
		while (input != 0.0) {
			
			input = sc.nextInt(); 
			if (input > 0 ) {
				positive++;
			} else if (input < 0) {
				negative++;
			}
			sum += input; 
			counter++;
		}
		
		if (counter == 1) {
			
			System.out.println("No numbers are entered except 0");
		} else {
			System.out.println("The number of positives is " + positive);
			System.out.println("The number of negatives is " + negative);
			System.out.println("The total is " + sum);
			System.out.println("The average is " + (double)(sum/(counter - 1)));
		}
		
		
		
	}
	

}
