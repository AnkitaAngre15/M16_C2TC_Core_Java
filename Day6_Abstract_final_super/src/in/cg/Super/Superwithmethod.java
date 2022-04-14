package in.cg.Super;

class Bank{
	void print() {
		System.out.println("I Am 10 Years Old Customer Of This SBI Bank");
	}
}
class Customer extends Bank{
	void print() {
		System.out.println("My Savings Account Is In SBI");
	}

void display() {
	print();
	super.print();
}
	
}
public class Superwithmethod {

	public static void main(String[] args) {
		Customer c=new Customer();
		c.display();

	}

}
