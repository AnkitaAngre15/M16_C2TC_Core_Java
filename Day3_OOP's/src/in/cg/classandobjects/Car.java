package in.cg.classandobjects;

public class Car
{
	String name="BMW";//Variable
	void print() //Method
	{
		System.out.println("This is "+name);
	}

	public static void main(String[] args) 
	{
		Car obj1=new Car();
		obj1.print();
	}

}
