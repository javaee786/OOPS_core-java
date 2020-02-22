package polymorphism;

class Bike {
	void run() {
		System.out.println("running");
	}
}

public class Splendor extends Bike {
	void run() {
		System.out.println("running safely with 60 KM");
	}

	public static void main(String[] args) {
		Bike b=new Splendor();
		b.run();
	}//main()
}//class Splendor
