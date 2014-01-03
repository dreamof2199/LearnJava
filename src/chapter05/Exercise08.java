package chapter05;

class NBA1{
	void f1(){
		this.f2().f2().f2();
	}
	NBA1 f2() {
		System.out.println("I love this game!");
		return this;
	}
}

public class Exercise08 {
	public static void main(String[] args) {
		new NBA1().f1();
	}
}
