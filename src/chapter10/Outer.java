package chapter10;

public class Outer {
	class Inner{
		Inner(){
			System.out.println("Initialize Inner!");
		}
	}
	
	public Inner getInner(){
		return new Inner();
	}
	
	public static void main(String[] args) {
		Outer.Inner i = new Outer().getInner();
	}
}
