package chapter02;

public class Incrementable {
	static int i = 10;
	
	static void increment(){
		Incrementable.i++;
		System.out.println("Incrementable.i = " + Incrementable.i);
	}
	
	public static void main(String[] args){
		for(int i = 0; i < 10; ++i)
			Incrementable.increment();
	}
}
