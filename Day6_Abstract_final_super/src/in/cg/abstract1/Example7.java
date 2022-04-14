package in.cg.abstract1;

class Vehicle{
	Vehicle(){
		System.out.println("This Is Vehicle Class");
	}
}
class Car extends Vehicle{
	Car(){
		super();
		System.out.println("This Is Car Class");
		
	}
}

public class Example7 {

	public static void main(String[] args) {
		
Car c=new Car();

	}

}
