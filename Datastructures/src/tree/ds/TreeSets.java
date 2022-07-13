package tree.ds;


import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {
		
		//creating a Tree set
				TreeSet <String>fruits=new TreeSet<String>();
				fruits.add("Apple");
				fruits.add("Grapes");
				fruits.add("Mango");
				fruits.add("Kiwi");
				fruits.add("Banana");
				fruits.add("Blueberry");
				fruits.add("Berry");
				
				System.out.println(fruits);
				
				//searching boolean <returntype>
				if(fruits.contains("Apple")) {
					System.out.println("The TreeSet contains Apple");
				}else {
					System.out.println("The TreeSet does not contains Apple");
					
				}
				//size method
				System.out.println("size : "+fruits.size());
				
				System.out.println(fruits.ceiling("Banana"));
				
				//using iteration
				Iterator it=fruits.iterator();
				while(it.hasNext())
					System.out.println(it.next());
				
				//removing
				fruits.remove("Berry");
				
				System.out.println(fruits.toString().valueOf(fruits));
				
				System.out.println("\nDescending Iterator:");
				Iterator ite=fruits.descendingIterator();
				while(ite.hasNext())
					System.out.println(ite.next());
				
	}

}
