package polymorphism;

class Shape {
	void draw() {
		System.out.println("drawing...");
	}
}

class Rectgangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle...");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing circle...");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("drawing triangle...");
	}
}

public class TestPolymorphism2 {
	public static void main(String[] args) {
		Shape s;
		s = new Rectgangle();
		s.draw();
		s = new Circle();
		s.draw();
		s = new Triangle();
		s.draw();
	}// main()
}// class TestPolymorphism2
