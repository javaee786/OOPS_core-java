package aggregation;

class Operation {
	int square(int n) {
		return n * n;
	}
}// class Operation

public class Circle {
	Operation op;// aggregation
	double pi = 3.14;

	// method:-
	double area(int radius) {
		op = new Operation();
		int rsquare = op.square(radius);
		return pi * rsquare;
	}// area()

	public static void main(String[] args) {
		Circle c = new Circle();
		double result = c.area(5);
		System.out.println(result);
	}// main()

}// class Circle
