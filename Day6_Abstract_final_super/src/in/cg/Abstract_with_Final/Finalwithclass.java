package in.cg.Abstract_with_Final;

final class Dance{
	
}
class Contemporary extends Dance{ //Here We Cannot Inherit Our SuperClass Into Subclass 
	                              //As Superclass Is Declared As Final.
	void print() {
		System.out.println("Contemporary Dance Form Is My Favourite");
	}
}

public class Finalwithclass {

	public static void main(String[] args) {
		Contemporary c=new Contemporary();
		c.print();
		

	}

}
