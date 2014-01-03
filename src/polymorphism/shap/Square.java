package polymorphism.shap;

import static chapter03.Print.print;

public class Square extends Shape{
	@Override
	public void draw(){
		print("Square.draw()");
	}
	public void erase(){
		print("Square.draw()");
	}
}
