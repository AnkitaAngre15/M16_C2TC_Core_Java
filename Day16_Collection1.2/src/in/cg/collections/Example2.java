package in.cg.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example2 {

	public static void main(String[] args) {
	
		PriorityQueue obj=new PriorityQueue();
		obj.add(11);
		obj.add(2);
		obj.add(33);
		System.out.println(obj);
		obj.offer(11);
		obj.offer(2);
		obj.offer(33);
		System.out.println(obj);
		System.out.println(obj.peek());
		System.out.println(obj.element());
		

	}

}
