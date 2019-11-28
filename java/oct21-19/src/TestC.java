
public class TestC {
public static void main(String[] args) {
	person.color = "white";
	person.walk();
	System.out.println("person color "+person.color);
	System.out.println("******************************************");
	person p1 = new person();
	p1.age = 20;
	p1.name = "sindhu";
	System.out.println("person p1 age "+p1.age);
	System.out.println("person p1 name is "+p1.name);
	p1.color = "black";
	p1.walk();
	
	System.out.println("**********************************************");
	person p2 = new person();
	p2.age = 30;
	p2.name = "indhu";
	System.out.println("person p2 age "+p2.age);
	System.out.println("person p2 name is "+p2.name);
	
}
}
