package chapter05;

class StaticString{
	static String s1 = "string s1";
	static String s2;
	static {
		s2 = "string s2";
	}
	StaticString(){
		System.out.println("constructor: s1 = " + s1 + ", s2 = " + s2);
	}
	void print(){
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
	}
}

public class Exercise14 {
	public static void main(String[] args) {
		new StaticString();
//		new StaticString().print();
		int[] i = {1,2};
		for (int k = 0; k <= i.length; k++) {
			System.out.println(i[k]);
		}
	}
}
