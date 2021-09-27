
import java.util.Scanner; 

public class FinancialPayrolApp {

	public static void main(String [] args) {
	
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter employee's name: ");
		String name = sc.next();
		System.out.print("Enter number of hours worked in a week: ");
		double hours = sc.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double payRate = sc.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double fedRate = sc.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double stateRate = sc.nextDouble();
		double fedDeduction = (payRate * hours) * (fedRate/100.0);
		double stateDeduction = (payRate * hours) * (stateRate/100.0);
		
		System.out.printf("Gross pay: $%f\n",(payRate*hours));
		System.out.println("Deductions: ");
		System.out.printf("Federal Withholding (%.1f%%): $%.2f\n",fedRate, fedDeduction);
		System.out.printf("State Withholding (%.1f%%): $%.2f\n", stateRate, stateDeduction);
		System.out.printf("Total Deduction: $%.2f\n", (fedDeduction + stateDeduction));
		System.out.printf("Net pay: $%.2f\n", ((payRate*hours) - (fedDeduction + stateDeduction)));
	}
}
