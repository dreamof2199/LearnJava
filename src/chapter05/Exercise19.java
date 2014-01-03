package chapter05;

class StringArray{
	StringArray(String... sa){
		for(String s : sa)
			System.out.println(s);
	}
}

public class Exercise19 {
	public static void main(String... args) {
		new StringArray(args);
	}
}
