package in.cg.abstract1;


class Parent{
	final void accept() {
		System.out.println("Parent");
	}
}
class Child extends Parent{
	void print() {
		System.out.println("Child");
	}
}
public class Example3 {

	public static void main(String[] args) {
		Child c=new Child();
		c.print();
		c.accept();

	}

}
