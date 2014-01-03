package chapter03;
import static chapter03.Print.*;

public class AutoInc {
	public static void main(String[] args) {
		int i = 1;
		print("i : " + i);
		print("++i : " + ++i);
		print("i++ : " + i++);
		print("i : " + i);
		print("--i : " + --i);
		print("i-- : " + i--);
		print("i : " + i);
	}
}
