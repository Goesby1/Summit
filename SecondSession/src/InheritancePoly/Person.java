package InheritancePoly;

public class Person {
	
	public String name;
	public String address; 
	public String phoneNumber; 
	public String email; 
	
	public Person() {
		this("Unknown","Unknown","unknown","Unknown");
	}
	
	public Person (String name, String address, String phoneNumber, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber; 
		this.email = email;
	}
	
	@Override
	public String toString() {
		return String.format("Class: %s, Name: %s", "Person", this.name);
		
	}
	
	

}
