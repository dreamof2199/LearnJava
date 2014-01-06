package innerclasses.pack2;

import innerclasses.pack1.InterfaceA;

public class ClassA {
	protected class ClassB implements InterfaceA{

		public ClassB() {
			System.out.println("Construct ClassB");
		}

		@Override
		public void play() {
			System.out.println("ClassB.play()");
		}
		
	}
}
