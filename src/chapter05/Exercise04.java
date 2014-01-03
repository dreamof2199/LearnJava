package chapter05;

class Exer04{
	Exer04(){
		System.out.println("Create class Exer03");
	}
	Exer04(String s){
		System.out.println("Create class Exer03 = " + s);
	}
}

public class Exercise04 {
	public static void main(String[] args) {
		new Exer04();
		new Exer04("Hello world");
	}
}
