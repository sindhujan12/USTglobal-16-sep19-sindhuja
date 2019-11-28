
public class Student {
	String name;
	int id;
	String branch;
	int age;
	int marks;
	public Student(String name , int id, String branch, int age, int marks) {
		this.name = name;
		this.id = id;
		this.branch = branch;
		this.age = age;
		this.marks = marks;
	}
	void printDetails() {
		System.out.println("name is "+name);
		System.out.println("id is "+id);
		System.out.println("branch is "+branch);
		System.out.println("age is "+age);
		System.out.println("marks is "+marks);

	}
	
	public static void main(String[] args) {
		Student s1 = new Student("Sindhu", 1,"ECE", 22,96);
	    s1.printDetails();
	    System.out.println("*********************************");
	    Student s2 = new Student("indhu", 2,"CIVIL", 22,86);
	    s2.printDetails();
	    System.out.println("*********************************");
	    Student s3 = new Student("bindhu", 3,"EEE", 22,76);
	    s3.printDetails();
	    System.out.println("*********************************");
	    Student s4 = new Student("priya", 4,"CSE", 22,89);
	    s4.printDetails();
	    System.out.println("*********************************");
	    Student s5 = new Student("riya", 5,"ECE", 22,46);
	    s5.printDetails();
	    System.out.println("*********************************");
	    Student s6 = new Student("jiya", 6,"CIVIL", 22,68);
	    s6.printDetails();
	    System.out.println("*********************************");
	    Student s7 = new Student("zoya", 7,"EEE", 22,91);
	    s7.printDetails();
	    System.out.println("*********************************");
	    Student s8 = new Student("sana", 8,"MECH", 22,93);
	    s8.printDetails();
	    System.out.println("*********************************");
	    Student s9 = new Student("riya", 9,"CSE", 22,75);
	    s9.printDetails();
	    System.out.println("*********************************");
	    Student s10 = new Student("siya", 10,"ECE", 22,89);
	    s10.printDetails();
	
	
	}
}
