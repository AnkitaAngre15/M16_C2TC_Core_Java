package in.cg.instanceof1;

class Example2{
	void print() {
		System.out.println("hi....");
	}
}
public class Example1 extends Example2 {

	public static void main(String[] args) {
		
		Example1 e=new Example1();
		System.out.println(e instanceof Example2);

	}

}
