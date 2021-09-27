

import java.util.Random;
import java.util.Scanner; 


public class FlowControlsPatternsLottery {
	
	public static void main (String [] args) {
		
		Random ra = new Random();
		Scanner sc = new Scanner(System.in);
		
		int lotto = ra.nextInt(1000);
		int lottoLast = lotto % 10; 
		int lottoMid = (lotto/10) % 10;
		int lottoFirst = (lotto/100);
		System.out.println("The lotto is " +lotto);
		System.out.print("Enter a three digit number value: ");
		int num = sc.nextInt();
		int numLast = num % 10; 
		int numMid = (num/10) % 10;
		int numFirst = (num/100);
		
		if (numFirst == lottoFirst) {
			if (numMid == lottoMid) {
				if (numLast == lottoLast) {
					System.out.println("You have won $10,000!!!");
				} else {
					System.out.println("You have won $1,000!!!");

				}
			} else if (numMid == lottoLast) {
				if (numLast == lottoMid) {
					System.out.println("You have won $3,000!!!");
				}  else {
					System.out.println("You have won $1,000!!!");

				}
			} else {
				if (numFirst != 0) {
					System.out.println("You have won $1,000!!!");
				}
			}
		} else if (numFirst == lottoMid) {
			if (numMid == lottoLast) {
				if (numLast == lottoFirst) {
					System.out.println("You have won $3,000!!!");
					
				}  else {
					System.out.println("You have won $1,000!!!");

				}
				
			} else if (numMid == lottoFirst) {
				if (numLast == lottoLast) {
					System.out.println("You have won $3,000!!!");

				} else {
					System.out.println("You have won $1,000!!!");

				}
			} else {
				System.out.println("You have won $1,000!!!");

			}
			
		}else if (numFirst == lottoLast) {
			if (numMid == lottoFirst) {
				if (numLast == lottoMid) {
					System.out.println("You have won $3,000!!!");
					
				}  else {
					System.out.println("You have won $1,000!!!");

				}
				
			} else if (numMid == lottoMid) {
				if (numLast == lottoFirst) {
					System.out.println("You have won $3,000!!!");

				} else {
					System.out.println("You have won $1,000!!!");

				}
			} else {
				System.out.println("You have won $1,000!!!");

			}
		} 
	}
}
