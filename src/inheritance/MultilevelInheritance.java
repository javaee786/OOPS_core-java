package inheritance;

class AnimalClass {
	void eat() {
		System.out.println("eating...");
	}
}

class DogClass extends AnimalClass {
	void bark() {
		System.out.println("barking...");
	}
}

class BabyDogClass extends DogClass {
	void weep() {
		System.out.println("weeping...");
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		BabyDogClass d=new BabyDogClass();
		d.weep();
		d.bark();
		d.eat();
	}
}
