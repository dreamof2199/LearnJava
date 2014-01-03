package chapter04;
import static chapter03.Print.*;
public class LabeledFor {
	public static void main(String[] args) {
		int i = 0;
		outer:	// Can't have statement here
			for(; true ;) {
				inner:	// Can't have statement here
					for(; i < 10; i++) {
						print("i = " + i);
						if(i == 2) {
							print("continue");
							continue;
						}
						if(i == 3) {
							print("break");
							i++;	// Otherwise i never gets increment
							break;
						}
						if(i == 7) {
							print("continue outer");
							i++;
							continue outer;
						}
						if(i == 8) {
							print("break outer");
							break outer;
						}
						for(int k = 0; k < 5; k++) {
							if(k == 3) {
								print("continue inner");
								continue inner;
							}
						}
					}
			}
	}
}
