package in.cg.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example3 {

	public static void main(String[] args) {
		
		Deque d=new ArrayDeque();
		d.add(15);
		d.add("Ankita");
		System.out.println(d);
		d.addFirst(14);
		d.addLast("Angre");
		System.out.println(d);
		d.removeFirst();
		d.removeLast();
		System.out.println(d);
		

	}

}
