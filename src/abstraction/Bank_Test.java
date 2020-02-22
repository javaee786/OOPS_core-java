package abstraction;

abstract class Bank {
	abstract int getRateOfInterest();
}// abstract class

class SBI extends Bank {

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 7;
	}
}

class PNB extends Bank {

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 8;
	}

}

public class Bank_Test {
	public static void main(String[] args) {
		Bank b1;
		b1 = new SBI();
		Bank b2;
		b2=new PNB();
		System.out.println("Rate of Interest for SBI is: "
				+ b1.getRateOfInterest() + " %");
		System.out.println("Rate of Interest for SBI is: "
				+ b2.getRateOfInterest() + " %");
	}

}// class Bank_Test
