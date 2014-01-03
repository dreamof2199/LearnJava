package chapter02;

public class Storage {
	int storage(String s) {
		return s.length() * 2;
	}
	
	public static void main (String[] args){
		String s = "Hello world!";
		Storage st = new Storage();
		System.out.println(st.storage(s));
	}
}
