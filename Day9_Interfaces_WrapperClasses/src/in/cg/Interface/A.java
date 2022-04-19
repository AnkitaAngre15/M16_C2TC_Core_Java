package in.cg.Interface;

public interface A {
	
	public void print();//Abstract Method

}
class B implements A {
	public void print() {
		
		System.out.println("Welcome to the concept of Interface");
	}

public static void main(String args[]) {
	
	B obj=new B();
	obj.print();
}
}