package chapter04;

public class Exercise10 {
	public static void main(String[] args) {
		for(int i = 1000; i < 2200; i++) {
			int k = 10, l = i / k;
//			System.out.print(k + "\t");
			while( k < 100 && k <= (Math.sqrt(i) + 1)){
				if(k * l == i && l < 100){ 
					if ((k % 10 == 0)) {
						if (l % 10 != 0) {
							System.out.println("i ====" + i + "  k ====" + k
									+ "  l====" + l);
						}
					}else {
						System.out.println("i ====" + i + "  k ====" + k
								+ "  l====" + l);
					}
					++k;
					l = i / k;
				}else{
					++k;
					l = i / k;
				}
			}
		}
	}
}
