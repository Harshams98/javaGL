package Collections;
import java.util.*;
public class Linkedlist //using queue
{

	static int hash=9;
	public static void main(String[] args) {
		Linkedlist l=new Linkedlist();
		System.out.println(Linkedlist.hash);
		
		System.out.println("========-=-=======");
		Queue<Integer> q=new LinkedList<>();
		
		q.offer(4);
		q.offer(6);
		q.add(8);
		q.add(10);
		q.offer(12);
		//System.out.println(q.poll());
		System.out.println(q.peek());
		
		//linked list does not contains index
		System.out.println(q.contains(7));

	}

}
