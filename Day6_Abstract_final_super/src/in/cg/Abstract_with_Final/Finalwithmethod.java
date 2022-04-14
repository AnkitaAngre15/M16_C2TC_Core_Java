package in.cg.Abstract_with_Final;

class College{
	final void print() {
		System.out.println("I Passed My BE From SIES Graduate School Of Technology College");
	}
}

class Professor extends College{
	void display() {
		System.out.println("We Had Best Professors In Our College");
	}
}

public class Finalwithmethod {

	public static void main(String[] args) {
		Professor p=new Professor();
		p.print();
		p.display();
	

	}

}
