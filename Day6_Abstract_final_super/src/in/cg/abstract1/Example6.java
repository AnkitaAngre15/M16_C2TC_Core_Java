package in.cg.abstract1;

class Super{
	
	void accept() {
		System.out.println("Super-Class");
	}
}

class Sub extends Super{
	void accept() {
		System.out.println("Sub-Class");
	}
void display() {
	accept();
	super.accept();
}
}

public class Example6 {

	public static void main(String[] args) {
	Sub s=new Sub();
	s.display();

	}

}
