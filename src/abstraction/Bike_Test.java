package abstraction;

abstract class Bike {
	public Bike() {
		System.out.println("Bike is created");
	}// default constructor

	abstract void run();

	void gearChanged() {
		System.out.println("Gear Changed");
	}

}// abstract class

class HondaClass extends Bike {

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("running safely");
	}

}

public class Bike_Test {
	public static void main(String[] args) {
		Bike obj = new HondaClass();
		obj.run();
		obj.gearChanged();
	}
}
