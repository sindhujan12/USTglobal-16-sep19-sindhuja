
public class TestG {
public static void main(String[] args) {
	FirstGen f = new FirstGen();
	f.msg();
	f.call();
	System.out.println("***********************************************");
	
	SecondGen s = new SecondGen();
	s.msg();
	s.call();
	s.games();
	
	System.out.println("***********************************************");
	
	ThirdGen t = new ThirdGen();
	t.msg();
	t.call();
	t.games();
	t.camera();
}
}
