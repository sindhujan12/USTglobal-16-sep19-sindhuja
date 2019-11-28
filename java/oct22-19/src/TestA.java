
public class TestA {
	 static int a = 30;
	int x;
	public static void add() {
		int b = 40;
		System.out.println(b);
		System.out.println(a);
	}
	public static void main(String[] args) {
		add();
		TestA t = new TestA();
		System.out.println("x value is "+t.x);
	}
}

