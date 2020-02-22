package abstraction;

abstract class Shapeclass {
	abstract void draw();
}

class Rectangle extends Shapeclass {

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing rectangle");
	}

}

class Circle extends Shapeclass {

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing circle");
	}

}

public class Test_Shape {
	public static void main(String[] args) {
		Shapeclass c = new Circle();
		Shapeclass r = new Rectangle();
		c.draw();
		r.draw();
	}
}// class Shape

