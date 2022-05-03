package in.cg.collections;

import java.util.HashMap;
import java.util.Map;

public class Example6 {

	public static void main(String[] args) {
		Map<Integer,String>obj=new HashMap<Integer,String>();
	
		obj.put(1, "Ankita");
		obj.put(3, "Vighnesh");
		obj.put(1, "Prema");
	System.out.println(obj);
	obj.remove(3);
	System.out.println(obj);
		

	}

}
