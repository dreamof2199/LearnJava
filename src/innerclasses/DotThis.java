package innerclasses;

public class DotThis {
	void f() {
		System.out.println("DotThis.f()");
	}

	public class Inner {
		public DotThis outer() {
			return DotThis.this;
		}
	}

	public Inner inner() {
		return new Inner();
	}

	public static void main(String[] args) {
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner(); // create Inner class only with a
										// DotThis Instance has been created
		dti.outer().f();				// Get the outer class
	}
}
