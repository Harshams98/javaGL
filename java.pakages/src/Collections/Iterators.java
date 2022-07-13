package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> li=new ArrayList<Integer>();
		
		li.add(50);
		li.add(51);
		li.add(52);
		li.add(50);
		li.add(53);
		li.add(54);
		li.add(55);
		
		li.add(56);
		li.add(6, 7);
		li.add(5);
		li.set(1, 511);
		
		Iterator it=li.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ListIterator lit=li.listIterator();
		
		System.out.println("forward");
		while(lit.hasNext())
			System.out.println(lit.next());

		System.out.println("Reverse");
		while(lit.hasPrevious())
			System.out.println(lit.previous());
	}

}
