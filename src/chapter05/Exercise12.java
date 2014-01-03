package chapter05;

class Tank{
	boolean isFull = false;
	String s = "abc";
	void takeOut(){
		isFull = true;
	}
	protected void finalize(){
		if(!isFull)
			System.out.println("The box is not empty!");
	}
}

public class Exercise12 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Tank t = new Tank();
//		t.takeOut();
//		new Tank();
//		System.gc();
		String str1 = "abc"; 
		String str2 = "abc"; 

		str1 = "bcd"; 

		String str3 = str1; 
		System.out.println(str3); //bcd 

		String str4 = "bcd"; 
		System.out.println(str1 == t.s); //true 
	}
}
