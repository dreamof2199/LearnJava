package chapter10;

public class Ex7 {
	private int i = 0;
	private int value(){
		return i;
	}
	class Ex7Inner{
		private int n = 10;
		private void add(){
			i++;
		}
		private void showValue(){
			System.out.println("value = " + i);
		}
	}
	Ex7Inner getInstance(){
		return this.new Ex7Inner();
	}
	public static void main(String[] args) {
		Ex7 e = new Ex7();
		Ex7Inner ei = e.getInstance();
		ei.add();
		ei.showValue();
	}
}
