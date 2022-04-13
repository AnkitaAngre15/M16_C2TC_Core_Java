package in.cg.inherit;


class Parent{
	void print() {
		System.out.println("This is an example of Single Inheritance");
	}
}

class Child extends Parent{
	void display() {
		System.out.println("Child Class");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.display();
		c.print();
	

	}

}
