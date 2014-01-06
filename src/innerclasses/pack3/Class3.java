package innerclasses.pack3;

import innerclasses.pack1.InterfaceA;
import innerclasses.pack2.ClassA;

public class Class3 extends ClassA{
	public InterfaceA getInterfaceA(){
		ClassA a = new ClassA();
		return (InterfaceA)this.new ClassB();
	}
	
	public static void main(String[] args) {
		Class3 c = new Class3();
		c.getInterfaceA().play();
	}
}
