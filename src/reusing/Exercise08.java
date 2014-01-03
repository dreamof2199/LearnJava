package reusing;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;

class BaseM {
	BaseM(int i) {
		System.out.println("constructor BaseM takes " + i);
	}
}

@SuppressWarnings("serial")
class Ve extends Vector<Object> {

	public void addElement(Object obj) {
		// TODO Auto-generated method stub
		super.addElement(obj);
	}

}

@SuppressWarnings("serial")
class Arr extends ArrayList<Object> {

}

@SuppressWarnings({ "rawtypes", "serial" })
class T extends Hashtable {

	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

}

public class Exercise08 extends BaseM {
	Exercise08() {
		super(11);
		System.out.println("constructor without args");
	}

	Exercise08(int j) {
		super(22);
		System.out.println("constructor with arg " + j);
	}

	public static void main(String[] args) {
		System.out.println("no arg construct");
		new Exercise08();
		System.out.println("arg construct");
		new Exercise08(33);
		// Hashtable ht
	}
}
