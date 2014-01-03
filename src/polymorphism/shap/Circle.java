package polymorphism.shap;
import static chapter03.Print.*;

public class Circle extends Shape{
	@Override
	public void draw(){
		print("Circle.draw()");
	}
	public void erase(){
		print("Circle.draw()");
	}
}
