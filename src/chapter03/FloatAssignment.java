package chapter03;
import static chapter03.Print.*;
class TankF {
	float level;
}

public class FloatAssignment {
	public static void main(String[] args) {
		TankF t1 = new TankF();
		TankF t2 = new TankF();
		t1.level = 9f;
		t2.level = 47f;
		print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
		t1 = t2;
		print("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
		t1.level = 27f;
		print("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
	}
}
