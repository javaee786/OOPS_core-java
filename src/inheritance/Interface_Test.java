package inheritance;

interface Printable {
	void print();
}// interface Printable

interface Showable extends Printable {
	void show();
}// interface Showable

abstract class TestClass implements Showable {
	public void print() {
		System.out.println("Printable...");
	}

	public void show() {
		System.out.println("Showable...");
	}
}//abstract class has 1 interface

class Tester extends TestClass{
	
}//class Tester

public class Interface_Test {
	public static void main(String[] args) {
		TestClass obj=new Tester();
		obj.print();
		obj.show();
	}// main()
}// class Interface_Test
