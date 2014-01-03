package chapter03;
import static chapter03.Print.*;

class FloatP {
	float c;
}

public class PassFloat {
	static void f(FloatP y) {
		y.c = 200f;
	}
	
	public static void main(String[] args) {
		FloatP x = new FloatP();
		x.c = 100f;
		print("1: x.c: " + x.c);
		f(x);
		print("2: x.c: " + x.c);
	}
}
