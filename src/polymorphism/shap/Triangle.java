package polymorphism.shap;

import static chapter03.Print.print;

public class Triangle extends Shape{
	@Override
	public void draw(){
		print("Triangle.draw()");
	}
	public void erase(){
		print("Triangle.draw()");
	}
}
