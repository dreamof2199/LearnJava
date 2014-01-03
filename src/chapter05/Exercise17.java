package chapter05;

class A{}

class SConstructor{
	public SConstructor(String s) {
		System.out.println("constructor: s = " +s);
	}
}

public class Exercise17 {
	
	static void print(){
		System.out.println("print function");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		SConstructor[] sc;
		sc = new SConstructor[]{new SConstructor("ssss"),new SConstructor("tttt")};
		print();
		A[] a = {new A(),new A(),new A(),};
		for(A temp : a)
			System.out.println(temp);
	}
}
