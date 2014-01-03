package chapter05;

class Finilize{
	int i = 0;
	void increment(){
		i++;
	}
	protected void finalize(){
		if(true)
			System.out.println("no increment");
	}
}

public class Exercise10 {
	public static void main(String[] args) {
//		Finilize f = new Finilize();
		new Finilize();
		System.gc();
	}
}
