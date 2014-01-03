package chapter04;

import java.util.Random;

public class Exercise02 {
	
	static int pre = 0, next = 0;
	
	public static void main(String[] args) {
		Random rand = new Random(); 
		for( int i = 1; i < 25; ++i){
			pre = rand.nextInt();
			next = rand.nextInt();
			System.out.println(i + " time, pre is " + pre + ", next is " + next);
			if(pre > next)
				System.out.println("bigger");
			else if(pre < next)
				System.out.println("smaller");
			else
				System.out.println("equal");
		}
			
	}
}
