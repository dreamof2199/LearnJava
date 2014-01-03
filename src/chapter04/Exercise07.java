package chapter04;

public class Exercise07 {
	public static void main(String[] args) {
		for (int i = 0;; ++i) {
			System.out.println(i);
			if (i == 99)
				break;
		}
		for (int i = 0;; ++i) {
			System.out.println(i);
			if (i == 99)
				return;
		}
	}
}
