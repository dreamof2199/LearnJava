package chapter08;

public class Exercise01 {
	static void ride(Cycle c) {
		c.ride();
	}
	public static void main(String[] args) {
		Unicycle uc = new Unicycle();
		Bicycle bc = new Bicycle();
		Tricycle tc = new Tricycle();
		ride(uc);
		ride(bc);
		ride(tc);
	}
}
