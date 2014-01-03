package reusing;

class A{
	A(){
		System.out.println("A is constructed!");
	}
}

class B{
	B(){
		System.out.println("B is constructed!");
	}
}

public class C extends A{
	B b = new B();
	public static void main(String[] args) {
		new C();
	}
}
