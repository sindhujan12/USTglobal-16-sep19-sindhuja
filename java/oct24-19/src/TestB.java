
public class TestB {
	static int b;
	int a;
	{
		a = 10;
		b = 20;
		System.out.println("non static block 1");
	}
	public static void main(String[] args) {
		System.out.println("main started");
		TestB t = new TestB();
		TestB t1 = new TestB();
		System.out.println("main ended");
		
		System.out.println("a is "+t.a);
		System.out.println("b is "+b);
		
	}
	{
		System.out.println("non static block 2");
	}
}
