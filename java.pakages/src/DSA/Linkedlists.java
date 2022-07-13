/**
 * 
 */
package DSA;
import java.util.LinkedList;
import java.util.Iterator;

public class Linkedlists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		LinkedList <Integer> li=new LinkedList<>();

		li.add(1);
		li.add(44);
		li.add(3);
		li.add(4);
		li.remove(1);//index//indexing starts from 0 in linked list
		li.add(1, 2);//index, value
		li.removeFirst();
		li.removeLast();
		Iterator i=li.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		li.add(1);
		li.add(44);
		li.add(3);
		li.add(4);
		li.add(1);
		li.add(44);
		li.add(3);
		li.add(4);
		System.out.println("----2--------");
		System.out.println(li.size());
		
		boolean find=li.contains(43 );
		System.out.println(find);
		
		LinkedList ltwo=new LinkedList();
		
		ltwo.add("harsha");
		ltwo.addAll(li);
		ltwo.add(7+5);
		ltwo.add("harsha mahendarkar");
		ltwo.add(7+5);
		ltwo.remove();
		System.out.println("==============================");
		System.out.println(ltwo);
		
		

	}

}
