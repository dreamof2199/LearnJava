package chapter05;

class Dog{
	void bark(int i){
		System.out.println("bark + i = " + i);
	}
	void bark(long l){
		System.out.println("bark + l = " + l);
	}
}

public class Exercise05 {
	public static void main(String[] args) {
		new Dog().bark(2l);
		new Dog().bark(2);
	}
}
