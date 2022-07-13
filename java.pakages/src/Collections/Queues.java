package Collections;
import java.util.*;
public class Queues {

	public static void main(String[] args) {

		Queue names=new LinkedList();
		names.add("Harsha");
		names.add("Mahendarkar ");
		names.add("Suresh");
		names.add("Mysore");
		
		System.out.println(names);
		
		System.out.println("Element : "+names.element());
		System.out.println("Peek : "+names.peek());
		
		names.remove();
		System.out.println("After removing : "+names);
		
		System.out.println("poll : "+names.poll());

		System.out.println("---------------------");
		PriorityQueue<Integer> name=new PriorityQueue<Integer>();
		name.add(2);
		name.add(2);
		name.add(6);
		name.add(1);
		name.add(3);
		name.add(4);
		
		System.out.println(name);
	}

}
