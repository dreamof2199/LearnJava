package chapter04;

public class Exercise04 {
	public static void main(String[] args) {
		int n = 0;
		for(int i = 2; i < 1000; ++i){
			int count = 0;
			for (int j = 1; j <= i; ++j){
				if(i % j == 0){
					++count;
				}
			}
			if(count == 2){
				++n;
				System.out.print(i + "\t");
				if(n % 4 == 0) {
					System.out.println("");
				}
			}
		}
	}
}
