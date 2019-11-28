
public class Employee {
	
	String ename;
	int eid;
	public Employee(String name , int id) {
		ename = name;
		eid = id;
	}
	void printDetails() {
		System.out.println("name is "+ename);
		System.out.println("id is "+eid);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("Sindhu", 143);
	e1.printDetails();
		Employee e2 = new Employee("Sanju",123);
	e2.printDetails();
		Employee e3 = new Employee("Scooby",124);
		e3.printDetails();
	}

}
