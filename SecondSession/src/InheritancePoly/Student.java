package InheritancePoly;

public class Student extends Person {

	public final String status; 
	
	public Student(String name, String address, String phoneNumber, String email, String status) {
		super(name, address, phoneNumber, email);
		this.status = status;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return String.format("Class: %s, Name: %s", "Student", this.name);
		
	}

}
