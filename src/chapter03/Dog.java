package chapter03;

public class Dog {
	String name;
	String says;
	
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		dog1.name = "spot";
		dog1.says = "Ruff!";
		dog2.name = "scruffy";
		dog2.says = "Wurf!";
		System.out.println("dog1 is " + dog1.name + ", bark : " + dog1.says);
		System.out.println("dog2 is " + dog2.name + ", bark : " + dog2.says);
		Dog index = dog1;
		System.out.println( "index == dog1 is  " + (index == dog1));
		System.out.println( "index.equals(dog1) is  " + index.equals(dog1));
	}
}
