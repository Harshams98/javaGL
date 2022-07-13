package Collections;
import java.util.*;
public class Dequeue_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> dq= new LinkedList<String>();//
		
		dq.addFirst("one");
		dq.addFirst("two");
		dq.add("three");
		dq.addLast("four");
		dq.addLast("five");
		dq.addFirst("six");
		dq.add("seven");
		
		System.out.println(dq);
		
		System.out.println("Get first: "+dq.getFirst());
		System.out.println("Get last"+dq.getLast());
		System.out.println("peek first :"+dq.peekFirst());
		System.out.println("peek last :"+dq.peekLast());
		System.out.println(dq);
		System.out.println("pool first :"+dq.pollFirst());
		System.out.println("pool Last :"+dq.pollLast());

		System.out.println(dq.size());
		
		if(dq.contains("seven")) {
			System.out.println("element found ");
		}else {
			System.out.println("element not found ");
		}
	
	}

}
