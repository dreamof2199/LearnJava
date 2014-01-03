package chapter03;

public class Compare {
	public static void main(String[] args) {
		String a = args[0];
		String b = args[1];
		System.out.println("a is ");
		System.out.println("b is ");
		System.out.println("a == b is " + (a == b));
		System.out.println("a equals b is " + (a.endsWith(b)));
	}

}
