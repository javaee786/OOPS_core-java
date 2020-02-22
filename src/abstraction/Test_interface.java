package abstraction;

interface A {
	void a();

	void b();

	void c();

	void d();
}// interface

abstract class B implements A {
	public void c() {
		System.out.println("I am c");
	}
}// Abstract class

class M extends B {

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("I am a");
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("I am b");
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("I am d");
	}

}

public class Test_interface {
	public static void main(String[] args) {
		A a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}// main()
}// class
