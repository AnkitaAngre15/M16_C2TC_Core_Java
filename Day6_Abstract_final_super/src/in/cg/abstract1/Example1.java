package in.cg.abstract1;

abstract class A{
	
	abstract void print();
		
	}
class B extends A{
	void print() {
		System.out.println("Welcome to Abstract Method");
	}
}

public class Example1 {

	public static void main(String[] args) {
		B obj=new B();
		obj.print();

	}

}
