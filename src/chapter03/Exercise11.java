package chapter03;
import static chapter03.Print.*;

public class Exercise11 {
	
	public static void main(String[] args) {
		
	int i = 0x80000000;
	/**
	 * signed left shift
	 */
	for (int j = 0; j < 32; ++j)
		print(Integer.toBinaryString(i>>j));
	/**
	 * unsigned left shift
	 */
	for (int k = 0; k < 32; ++k)
		print(Integer.toBinaryString(i>>>k));
	
	print(Integer.toBinaryString('c'));
	print(Integer.toBinaryString(' '));
	}
}
	
