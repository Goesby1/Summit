package oop;

import java.util.Date;

/*Account that contains:
¦ A private int data field named id for the account (default 0).
¦ A private double data field named balance for the account (default 0).
¦ A private double data field named annualInterestRate that stores the
current interest rate (default 0). Assume all accounts have the same interest rate.
¦ A private Date data field named dateCreated that stores the date when the
account was created.
¦ A no-arg constructor that creates a default account.
¦ A constructor that creates an account with the specified id and initial balance.
¦ The accessor and mutator methods for id, balance, and
annualInterestRate.
¦ The accessor method for dateCreated.
¦ A method named getMonthlyInterestRate() that returns the monthly
interest rate.
¦ A method named getMonthlyInterest() that returns the monthly interest.
¦ A method named withdraw that withdraws a specified amount from the
account.
¦ A method named deposit that deposits a specified amount to the account

The method getMonthlyInterest() is to return monthly interest, not the interest rate. Monthly
interest is balance * monthlyInterestRate. monthlyInterestRate is annualInterestRate / 12. Note that annualInterestRate is a percentage,
e.g.,like 4.5%. You need to divide it by 100.)
 */
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated; 
	
	public Account () {
		this.id = 0; 
		this.balance = 0.0;
		this.annualInterestRate = 0.0;
		this.dateCreated = new Date();
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();

	}
	
	public int displayID() {
		return this.id;
	}
	
	public double displayBalance () {
		return this.balance;
	}
	 
	public double displayAnnualIR () {
		return this.annualInterestRate;
	}
	
	public void setID( int id) {
		this.id = id;
	}
	
	public void setBalance (double balance) {
		this.balance = balance;
	}	
	 
	public void setAnnualIR (double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date displayDate () {
		return this.dateCreated;
	}
}


