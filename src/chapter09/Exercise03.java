package chapter09;

abstract class Exer03 {
	abstract void print();

	Exer03() {
		print();
	}
}

class Exer03N extends Exer03 {
	int i = 5;

	@Override
	void print() {
		System.out.println("Inside Exer03N i = " + i);
	}

}

public class Exercise03 {
	public static void main(String[] args) {
		new Exer03N().print();
	}
}
