package inheritance;

class Animal_Class {
	void eat() {
		System.out.println("eating...");
	}
}

class DogClass_class extends Animal_Class {
	void bark() {
		System.out.println("barking...");
	}
}

class Cat extends Animal_Class {
	void meow() {
		System.out.println("meowing...");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.meow();
		c.eat();
		// c.bark();
	}
}
