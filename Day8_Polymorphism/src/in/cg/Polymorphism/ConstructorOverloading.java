package in.cg.Polymorphism;

class Renault{
	
	String color;
	int speed;
	
	Renault(){
		System.out.println("Renault-RXE");
}
	
	Renault(String clr,int s){
		color=clr;
		speed=s;
		System.out.print("Color is: " + clr);
		System.out.print(" Speed is: " + s );
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
      Renault r=new Renault();
      Renault r1=new Renault("Black", 80);

	}

}
