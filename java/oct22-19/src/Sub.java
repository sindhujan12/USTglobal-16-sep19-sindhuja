
public class Sub extends Super{
	String s = "subclass variable";
	
	Sub() {
	super();
		System.out.println("sub class constructor");
	}
	
	void get() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("**************************");
		super.superMethod();
	}

}
