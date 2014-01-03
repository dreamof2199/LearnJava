package chapter03;
import static chapter03.Print.*;

import java.util.Random;

public class Bool {
	public static void main(String[] args) {
		Random rand = new Random(47);
		int i = rand.nextInt(100);
		int j = rand.nextInt(100);
		print("i = " + i);
		print("j = " + j);
		print("i > j is " + (i > j));
		print("i > j is " + (i > j));
		print("i >= j is " + (i >= j));
		print("i >= j is " + (i >= j));
		print("i == j is " + (i == j));
		print("i != j is " + (i != j));
		// Treating an int as a boolean is not legal Java:
//!		print("i && j is " + (i && j));
//!		print("i || j is " + (i && j));
//!		print("!i is " + (i && j));
		print("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
		print("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
	}
}
