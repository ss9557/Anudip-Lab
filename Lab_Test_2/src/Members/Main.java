package Members;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee("ashu",,"6203102809","chi 5",554588.9,"cs");
		// instance of Manager class
		Manager mng = new Manager("Atul",25,"8810529965","New Delhi",887799.99,"cce");
		// now print the salary
		emp.printSalary();
		mng.printSalary();

	}

}
