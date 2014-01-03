package chapter05;

class Poker {
	int i = 0;
	String s = "a string";
	Poker(String s) {
		this(3);
		s += s;
		System.out.println("constructor /w string arg");
		System.out.println("result s = " + s + ", i = " + i);
	}
	Poker(int i) {
		i += i;
		System.out.println("constructor /w int arg");
	}
}

public class Exercise09 {
	public static void main(String[] args) {
		new Poker("world");
	}
}
