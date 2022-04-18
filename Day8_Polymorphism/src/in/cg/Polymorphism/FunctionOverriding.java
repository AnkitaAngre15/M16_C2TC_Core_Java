package in.cg.Polymorphism;

class Fruits{
	void display() {
		System.out.println("Fruit Class");
	}
}
class Banana extends Fruits{
	void display() {
		System.out.println("Banana class");
	}
}

class Grapes extends Fruits{
	void display() {
		System.out.println("Grapes class");
	}
}

public class FunctionOverriding {

	public static void main(String[] args) {
	
        Fruits f=new Fruits();
		Banana b=new Banana();
		Grapes g=new Grapes();
		b.display();
		f.display();
		g.display();
	}

}
