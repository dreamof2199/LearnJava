package chapter03;
import static chapter03.Print.*;

public class Literals {
	public static void main(String[] args) {
		int i1 = 0x2f;
		print("i1: " + Integer.toBinaryString(i1));
		int i2 = 0X2F;
		print("i2: " + Integer.toBinaryString(i2));
		int i3 = 0177;
		print("i3: " + Integer.toBinaryString(i3));
		char c = 0xffff;
		print("c: " + Integer.toBinaryString(c));
		byte b = 0x7f;
		print("b: " + Integer.toBinaryString(b));
		short s = 0x7fff;
		print("s: " + Integer.toBinaryString(s));
		long n1 = 200L;
		print("n1: " + Long.toBinaryString(n1));
		long n2 = 200l;
		print("n2: " + Long.toBinaryString(n2));
		long n3 = 200;
		print("n3: " + Long.toBinaryString(n3));
		float f1 = 1;
		print("f1: " + Float.toHexString(f1));
		float f2 = 1F;
		print("f2: " + Float.toHexString(f2));
		float f3 = 1f;
		print("f3: " + Float.toHexString(f3));
		double d1 = 1;
		print("d1: " + Double.toHexString(d1));
		double d2 = 1d;
		print("d2: " + Double.toHexString(d2));
		double d3 = 1D;
		print("d3: " + Double.toHexString(d3));
	}
}
