package in.cg.inherit;



class Samsung{
	void accept() {
		System.out.println("Samsung Galaxy");
	}
}
class Oneplus extends Samsung{
	void print() {
		System.out.println("Oneplus");
	}
}

class Iphone extends Oneplus{
	void display() {
		System.out.println("Iphone");
	}
}

public class MultilevelInheritance {
	
	public static void main (String args[]) {
		
		Iphone i=new Iphone();
		i.display();
		i.accept();
		i.print();
		
	}

}
