package chapter03;

import java.util.Random;

public class Coin {
	public static void main(String[] args) {
		Random rand = new Random();
		int coin = rand.nextInt(3);
		System.out.println("The coin is bigger is " + (coin >1));
	}
}
