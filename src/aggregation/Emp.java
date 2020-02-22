package aggregation;

public class Emp {
	int id;
	String name;
	Address address;// reference

	public Emp(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}// constructor

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " "
				+ address.country);
	}//display()

	public static void main(String[] args) {
		Address address1=new Address("Hyd", "Telangana", "India");
		Address address2=new Address("Bangalore", "KN", "India");
		
		Emp e1=new Emp(111, "raghu", address1);
		Emp e2=new Emp(112, "sai", address2);
		
		e1.display();
		e2.display();
		
		
		
		
		
	}// main()

}// class Emp
