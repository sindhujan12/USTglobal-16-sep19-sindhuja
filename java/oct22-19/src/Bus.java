
public class Bus {
	int seats;
	String color;
	
	Bus(int seats, String color) {
		this.seats = seats;
		this.color = color;
	}
	Bus(){
		this(40);
	}
	Bus(int seats) {
		this(seats,"red");
	}
	void get() {
		System.out.println("welcome to red bus, seat capacity is "+seats);
	}

}
