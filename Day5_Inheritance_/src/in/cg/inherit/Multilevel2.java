package in.cg.inherit;

class ParentClass{
	void display1() {
		System.out.println("This Is Parent Class");
	}
}
class Child1 extends Parent{
	void display2() {
		System.out.println("This Is First Child Class");
	}
}

class Child2 extends Child1{
	void display3() {
		System.out.println("This Is Second Child Class");
	}
}


public class Multilevel2 {
	
	public static void main (String args[]) {
		
		Child2 c2=new Child2();
				c2.display2();
		c2.display3();
		
		
		
	}

}


