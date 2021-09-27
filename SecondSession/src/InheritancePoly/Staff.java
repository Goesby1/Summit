package InheritancePoly;

public class Staff extends Employee{

	private String title;
	public Staff(String name, String address, String phoneNumber, String email, String office, double salary, String title) {
		super(name, address, phoneNumber, email, office, salary);
		this.title = title;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return String.format("Class: %s, Name: %s", "Staff", this.name);
		
	}

}
