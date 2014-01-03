package chapter02;

public class Args {
	public static void main(String[] args) {
		System.out.println("length = " + args.length);
		for(int i = 0;i<args.length;++i)
			System.out.println(args[i]);
	}
}
