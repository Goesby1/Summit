
import java.util.Scanner;


public class Datatypes_operators {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 numbers: ");
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		
		for (int i = firstNum; i <= secondNum; i++) {
		
			System.out.println(i + "\t" + i*i + "\t" + i*i*i );
			
		}
		
	}

}
