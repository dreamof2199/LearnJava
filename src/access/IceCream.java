package access;

class Sundae	{
	private Sundae(){
		
	}
	static Sundae makeASundae(){
		return new Sundae();
	}
}

public class IceCream {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		Sundae x0 = new Sundae();
		Sundae x = Sundae.makeASundae();
	}
}
