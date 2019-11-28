
public class Emp1 {
	String name;
	int id;
	long adhar;
	 Emp1(String name , int id, long adhar) {
			this.name = name;
			this.id = id;
			this.adhar = adhar;
		}
	 Emp1(String name , int id) {
			this.name = name;
			this.id = id;
	 }
	 Emp1( int id, String name ) {
			this.name = name;
			this.id = id;
	 }
	 void printDetails() {
			System.out.println("hi "+name+" welcome");
//			System.out.println("id is "+id)
		}
	 
}
