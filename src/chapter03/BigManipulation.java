package chapter03;

public class BigManipulation {
	public static void main(String[] args) {
		int a = 0xaaaa;
		int b = 0x5555;
		System.out.println("a & b is " + Integer.toBinaryString((a & b)));
		System.out.println("a | b is " + Integer.toBinaryString((a | b)));
		System.out.println("~a is " + Integer.toBinaryString((~a)));
		System.out.println("a ^ b is " + Integer.toBinaryString((a ^ b)));
	}
}
