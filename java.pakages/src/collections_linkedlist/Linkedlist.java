package collections_linkedlist;
import java.util.*;

public class Linkedlist {

	public static void main(String[] args) {
		//creating a instance of LL class
		LinkedList<String> list=new LinkedList<String>();
		
		//adding elements
		list.add("Harsha");
		list.add("Mahendarkar");
		list.add("Nie College");
		list.add("Mysore");
		//void all
		list.add(0, "Information");
		
		//beginning
		list.addFirst("Linked");
		//end
		list.addLast("Karnataka");
		
		//specific index
		list.add(2, "570008");
		
		System.out.println("Iterator");
      Iterator <String> ite=list.iterator();
		
		while(ite.hasNext()) {
			System.out.println("\t"+ite.next());
		}
		
		//sunList
		System.out.println("\nSubList :"+list.subList(0, 3));

		//adding element at the first of the linked list
		list.addFirst("Info");
		list.addFirst("Employee");
		list.addFirst("Linked");
		
		System.out.println("\nadding to first \n"+list);
		//removing first and last
		System.out.println("\nafter removing first and last\n"+list);
		list.removeFirst();
		list.removeLast();
		
		//removeing from specific index
		list.remove(3);
		System.out.println("\nIndex 3 (pos 4) removed == "+list);
		
		//removing specific element from list
				list.remove("Info");
				System.out.println("\n[Info] element removed == "+list);
		//System.out.println(list.hashCode());		
		
		//cloning
		LinkedList<String> li=(LinkedList<String>) list.clone();
		System.out.println(li);
		System.out.println("\nCloning = "+li);
		
		//remove all elements
		li.clear();
		System.out.println("\nRemove All = "+li);
		
		//append all
		li.addAll(list);
		System.out.println("\nAdd All = "+li);
		
		//add all at specific index
		li.addAll(2, li);
		System.out.println("\nAdd All @  index 2 = "+li);
		
		//contains
		if(li.contains("Harsha")) {
			System.out.println("LinkedList contains the element[Harsha]");
		}else {
			System.out.println("NO Element found");
		}
		
		//get method
		System.out.println("\nGet ele  @ index 2 is ="+li.get(2));
		System.out.println("Get first : "+li.getFirst());
		System.out.println("Get last : "+li.getLast());
		
		//indexof
		System.out.println("\nIndex of Element [570008] is = "+li.indexOf("570008"));
		
		//instance of
		if(li.get(0) instanceof String) {
			System.out.println("\nThe Linkedlist is the instanceof object of String  ");
		}
		
		
		//size
		System.out.println("\nsize of linked list is ="+ li.size());
		
		//set
		li.set(4, "570023");
		System.out.println("\nSet (replacing a Element)  = "+li);
		
		//searching
		System.out.println("\nElement found at the index of = "+Collections.binarySearch(list, "Harsha"));
	
		//sub list
		LinkedList<String> arr=new LinkedList<>(list.subList(0, 3));
		System.out.println("\nSub List = "+arr);
		
		//swap
		Collections.swap(arr, 0, 2);
		System.out.println("\nIndex 0 swaps index2= "+arr);
		
		//ListIterator
		System.out.println("\nListIterator--->");
		ListIterator lit=arr.listIterator();
		while(lit.hasNext()) {
			System.out.println("\t "+lit.next());
		
		}
		System.out.println("\nReverse ListIterator--->");
		//reverse Iterator
		while(lit.hasPrevious())
		{
			System.out.println("\t"+lit.previous());
		}
		
		
		
		System.out.println("\n"+arr);
		//peek
		System.out.println("peek = "+arr.peek());
		System.out.println("peek first ="+arr.peekFirst());
		System.out.println("peek last ="+arr.peekLast());
		
		//push adds at top
		arr.push("Banglore");
		arr.push("Delhi");
		System.out.println("\nAfter push = "+arr);
		
		arr.pop();
		System.out.println("After pop (LIFO) = "+arr);
		
		//poll
         System.out.println("\npoll :"+arr.poll());	
         System.out.println("poll first :"+arr.pollFirst());
         System.out.println("poll last :"+arr.pollLast());

         //sorting
         System.out.print("\nsorted Elements :");
         Collections.sort(list);
         System.out.println(list);
         //Reverse sorting
         System.out.print("\nReverse sorted Elements :");
         Collections.sort(list);
         Collections.reverse(list);
         System.out.println(list);
	}

}
