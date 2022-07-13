package FileHandling;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ListLinked {
	 public static void main(String args[]) 
     {
		 int J=0;
	     for (int i = 0; i < 5; ++i) {
         	System.out.print(++J);}
     System.out.println();

	 LinkedList <Integer>list = new LinkedList<>();
     list.add(2);
     list.add(8);
     list.add(5);
     list.add(1);
   
     Iterator<Integer> i = list.iterator();
     //Collections.reverse(list);
     Collections.shuffle(list);
 while(i.hasNext())
     System.out.print(i.next() + " ");

}
	 
}