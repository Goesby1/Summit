package InheritancePoly;

public class Employee extends Person {

	public String office;
	public double salary;
	//public MyDate date; 
	public Employee (String name, String address, String phoneNumber, String email, String office, double salary/*MyDate date*/) {
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
		//this.date = date;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("Class: %s, Name: %s", "Employee", this.name);
		
	}
	

}
