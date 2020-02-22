package abstraction;

abstract class Bikeclass {
	abstract void run();
}

public class Honda extends Bikeclass {
	public void run() {
		System.out.println("running safely");
	}

	public static void main(String[] args) {
		Bikeclass b = new Honda();
		b.run();
	}
}
