package in.cg.wrapper;

public class Example1 {
	
	
//Autoboxing-- Converting Primitive Datatypes into Wrapper Classes
	public static void main(String[] args) {
		float x=20.5f;// Primitive Datatypes
		Float y=x;
		Float obj=new Float(15.0f);// Wrapper Classes
		System.out.print(x+ " "+y+" "+obj);

	}

}
