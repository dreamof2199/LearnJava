package chapter05;

public class SimpleEnumUse {
	public static void main(String[] args) {
		for(Spiciness s : Spiciness.values())
			System.out.println(s);
	}
}
