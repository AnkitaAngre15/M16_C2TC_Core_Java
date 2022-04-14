package in.cg.Super;

class Vegetables{
	Vegetables(){
		System.out.println("Green Leafy Vegetables Are Good To Eat");
	}
}
class Brocolli extends Vegetables{
	Brocolli(){
		super();
		System.out.println("Brocolli Is Rich In Nutrients And Proteins");
		
	}
}

public class Superwithconstructor {

	public static void main(String[] args) {
		Brocolli b=new Brocolli();
		
	
		

	}

}
