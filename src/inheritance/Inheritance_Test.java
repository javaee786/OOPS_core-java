package inheritance;

interface AA {
	void a();

	void b();

	void c();

	void d();

}// interface AA

abstract class BB implements AA {
	public void c() {
		System.out.println("I am C");
	}
}// abstract class BB

class M extends BB {

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("I am A");
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("I am B");
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("I am D");
	}

}

public class Inheritance_Test {
	public static void main(String[] args) {
		AA a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}// main()
}// class Inheritance_Test
