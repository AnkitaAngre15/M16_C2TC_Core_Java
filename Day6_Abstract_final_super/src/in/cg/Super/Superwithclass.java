package in.cg.Super;

class Manager{
	String name="Ankita";
}

class Employee extends Manager{
	String name="Prema";
    
	void print() {
		System.out.println(name);
		System.out.println(super.name);
	}
}

public class Superwithclass {

	public static void main(String[] args) {
	
		Employee e=new Employee();
		e.print();

	}

}
