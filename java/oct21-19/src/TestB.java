
public class TestB {
public static void main(String[] args) {
	cow c = new cow();
	c.name = "gowri";
	c.color = "white";
	System.out.println("cow name is "+c.name);
	System.out.println("cow color is "+c.color);
	c.eat();
	c.sleep();
	System.out.println("*****************************");
	
	cow c1 = new cow();
	c1.name = "ganga";
	c1.color = "black";
	System.out.println("cow name is "+c1.name);
	System.out.println("cow color is "+c1.color);
	c1.eat();
	c1.sleep();
	
			
}
}
