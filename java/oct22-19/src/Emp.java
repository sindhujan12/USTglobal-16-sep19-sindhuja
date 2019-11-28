
public class Emp {
	String name;
	int id;
	public Emp(String name , int id) {
		this.name = name;
		this.id = id;
	}
	void printDetails() {
		System.out.println("name is "+name);
		System.out.println("id is "+id);
		this.sayHello();
	}
	void sayHello() {
		System.out.println("hello "+name+" welcome to class");
	}
	public static void main(String[] args) {
		Emp e1 = new Emp("Sindhu", 143);
	e1.printDetails();
	Emp e2 = new Emp("Sanju",123);
	e2.printDetails();
		Emp e3 = new Emp("Scooby",124);
		e3.printDetails();
	
	}
}
