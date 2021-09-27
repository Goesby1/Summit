package InheritancePoly;

public class Faculty extends Employee {
	
	private String officeHours;
	private int rank;
	
	public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, String officeHours, int rank ) {
		super(name, address, phoneNumber, email, office, salary);
		// TODO Auto-generated constructor stub
		this.officeHours = officeHours;
		this.rank = rank;
	}

	@Override 
	public String toString() {
		return String.format("Class: %s, Name: %s", "Faculty", this.name);
		
	}
}
