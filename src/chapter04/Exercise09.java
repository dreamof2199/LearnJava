package chapter04;

public class Exercise09 {
	static int pre = 1, next = 1;
	public static void main(String[] args) {
		int n = Integer.valueOf(args[0]), k = 0;
		System.out.print(pre + "\t");
		System.out.print(next + "\t");
		for(int i = 0; i < n - 2; i++) {
			int temp = pre + next;
			System.out.print(temp + "\t");
			pre = next;
			next = temp;
			++k;
			if(k % 5 == 3)
				System.out.println();
		}
	}
}
