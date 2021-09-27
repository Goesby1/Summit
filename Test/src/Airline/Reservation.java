package Airline;

import java.util.Scanner;
public class Reservation {
	
	int [] seats;
	
	public Reservation () {
		seats= new int[100];
		
	}
	
	public void addPassenger(int option) {
		int checker = 0;
		Scanner sc = new Scanner(System.in);
		if (option == 1) {
			for (int i = 0; i < 21; i++) {
				if(seats[i] == 0) {
					seats[i] = 1;
					checker++;
					System.out.println("Seat number is " + i +" in business class!");
					break;
				}
			}
		} else if (option == 2) {
			for (int i = 21; i < 51; i++) {
				if(seats[i] == 0) {
					seats[i] = 1;
					checker++;
					System.out.println("Seat number is " + i +" in first class!");
					break;

				}
			}
		} else if (option == 3) {
			for (int i = 51; i < 100; i++) {
				if(seats[i] == 0) {
					seats[i] = 1;
					checker++;
					System.out.println("Seat number is " + i +" in economy class!");
					break;

				}
			}
		}
		
		if (checker == 0) {
			if (option == 1 || option == 2) {
				System.out.println("First/business class is full. Would you like economy class? Enter 0 for \"No\" and 1 for \"Yes\" ");
				checker =  sc.nextInt();
			} else if (option == 3) {
				System.out.println("Economy is full would you like first/Business class? Enter 0 for \"No\" and 1 for \"Yes\" ");
				checker =  sc.nextInt();
			}
			
			if (checker == 1) {
				if (option == 1 || option == 2) {
					this.addPassenger(3);
				} else {
					this.addPassenger(2);
				}
			} 
		}
	}
	
	public void removePassenger(int seatNumber) {
		
		this.seats[seatNumber] = 0;
	}
	
	public void display () {
		System.out.println("Business class: ");
		for (int i = 0; i < 21; i++) {
			System.out.print(this.seats[i] + " ");
		}
		System.out.println("\nFirst Class: ");
		for (int i = 21; i < 51; i++) {
			System.out.print(this.seats[i] + " ");
		}
		System.out.println("\nEconomy Class: ");
		for (int i = 51; i < 100; i++) {
			System.out.print(this.seats[i] + " ");
		}
		
		
		
	}
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		Reservation rs = new Reservation();
		int option;
		
		
		do {
			System.out.println("Please enter from the following menue: "
					+ "\n1. Add a passenger to the reservation list"
					+ "\n2. Remove a passenger from the reservation list"
					+ "\n3. Display allotted seats of the flight"
					+ "\n4. Quit");
			option = sc.nextInt();
			
			if (option == 4) {
				break;
			} else if (option == 3) {
				rs.display();
			} else if (option == 2) {
				System.out.println("Enter the seat number: ");
				option = sc.nextInt();
				rs.removePassenger(option);
			} else if (option == 1) {
				System.out.println("Please type 1 for \"business class\""
						+ "\nPlease type 2 for \"first class \" "
						+ "\nPlease type 3 for \"economy class\""
						+ "\n-------------");
				option = sc.nextInt();
				rs.addPassenger(option);
			} else {
				System.out.print("Not a valid option");
			}
			System.out.print("\n\n\n\n");
			
		} while(true);
	
	}
	
	

}
