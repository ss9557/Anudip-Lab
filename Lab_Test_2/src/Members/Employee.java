package Members;

public class Employee extends Member{
	private String specialization;
	// parameterized Constructor
	public Employee(String name,int age,String phoneNumber, String address, double salary, String specialization) {
		// accessing Member class members
		super(name,age,phoneNumber,address,salary);
		this.specialization = specialization;
}
}
