package in.cg.inherit;

class ParentClass{
	void accept() {
		System.out.println("This Is Parent Class");
	}
}
class Child1 extends Parent{
	void print() {
		System.out.println("This Is First Child Class");
	}
}

class Child2 extends Child1{
	void display() {
		System.out.println("This Is Second Child Class");
	}

	
	}


public class Multilevel2 {
	
	public static void main (String args[]) {
		
		Child2 c=new Child2();
		c.display();
		c.print();
		
		
	}

}


