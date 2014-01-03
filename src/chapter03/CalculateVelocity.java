package chapter03;
import static chapter03.Print.*;

public class CalculateVelocity {

	public static void main(String[] args) {
		print("Please input two number");
		float velocity = Float.valueOf(args[0]) / Float.valueOf(args[1]);
		print("The velocity is " + velocity);
	}
}
