package polymorphism;

import static chapter03.Print.*;

class Shared {
	public static int refcount = 0;
	public static long counter = 0;
	private final long id = counter++;

	public Shared() {
		print("Creating " + this);
	}

	public void addRef() {
		refcount++;
	}

	protected void dispose() {
		if (--refcount == 0)
			print("Disposing " + this);
	}

	public String toString() {
		return "Shared " + id;
	}
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;

	public Composing(Shared shared) {
		print("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}

	protected void dispose() {
		print("disposing " + this);
		shared.dispose();
	}

	public String toString() {
		return "Composing " + id;
	}
}

public class ReferenceCounting {
	
	protected void finalize(){
		if(Shared.refcount != 0l)
			print("Error  " + Shared.refcount);
		else
			print("Exit");
	}
	
	public static void main(String[] args) {
		new ReferenceCounting();
		Shared shared = new Shared();
		Composing[] composing = { new Composing(shared), new Composing(shared),
				new Composing(shared), new Composing(shared),
				new Composing(shared) };
		for (Composing c : composing)
			c.dispose();
		System.gc();
	}
}