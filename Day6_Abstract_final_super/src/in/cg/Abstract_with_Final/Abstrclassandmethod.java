package in.cg.Abstract_with_Final;

abstract class manager
{
	abstract void print() ;
	
	}
class employee extends manager{
	
	void print() {
		System.out.println("I Am In Employee Class");
	}
}


public class Abstrclassandmethod {

	public static void main(String[] args) {
		
		employee e=new employee();
		e.print();
	

	}

}
