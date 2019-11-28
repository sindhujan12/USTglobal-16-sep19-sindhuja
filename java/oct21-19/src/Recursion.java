
public class Recursion
{
	public static void main(String[] args) {
		int factorial = fact(5);
		System.out.println("factorial of the number "+factorial);
	}
	static int fact(int n) {
		int op;
		if(n==1) {
			return 1;
		}
		op = fact(n-1)*n;
		return op;
	}

}
