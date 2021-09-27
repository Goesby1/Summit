package InheritancePoly;

public class Test {

	public static void main(String [] args) {
		Person p = new Person("Bob", "148 maple drive","222-222-2222","bob@yahoo.com");
		Student s = new Student("Bob", "148 maple drive","222-222-2222","bob@yahoo.com", "freshmen");
		Employee e = new Employee("Tod", "132 14th street", "312-234-4321", 
				"Tod@gmail.com", "Office 143 North Building", 95000.50);
		Staff sf = new Staff("Tod", "132 14th street", "312-234-4321", 
				"Tod@gmail.com", "Office 143 North Building", 95000.50, "Teacher");
		Faculty f = new Faculty("Dom", "153 17th street", "450-039-5839", "Dom@gmail.com", "Office 1323 South Building", 100000.50, "Office hours: 9:00am-3:00pm", 3);
		
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
		System.out.println(sf.toString());
		System.out.println(f.toString());

		
	}
}
