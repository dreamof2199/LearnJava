package chapter05;
import static chapter03.Print.*;

public class OverloadingOrder {
	static void f(String s, int i) {
		print("String: " + s + ", int: " + i);
	}
	static void f(int i,String s) {
		print("Int: " + i + ", String: " + s);
	}
	public static void main(String[] args) {
		f("String first", 11);
		f(99,"Int first");
	}
}
