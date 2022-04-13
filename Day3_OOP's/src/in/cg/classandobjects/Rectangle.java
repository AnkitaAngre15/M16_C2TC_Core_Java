package in.cg.classandobjects;

public class Rectangle {
	
	int length,breadth;
	
	public Rectangle(int l,int b) {//Parameterized Constructor
		
		length=l;
		breadth=b;
	}
	void calculate() {
		
		System.out.println(length*breadth);
	}
	public static void main(String[] args) {
		
		Rectangle r=new Rectangle(6,7);
		r.calculate();
				}

}
