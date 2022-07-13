package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Harsha");
		al.add("Mahendarkar");
		al.add("suresh");
		al.add("Mysore");
		al.add("karnataka");
		al.add("570008");
		
		
		
		//synchronizedList
		System.out.println(Collections.synchronizedList(al));
		
		//clone
		ArrayList<String> all = (ArrayList<String>) al.clone();
		
		Iterator it = all.iterator();
		  
          while (it.hasNext())
              System.out.println(it.next());
          
        //compare
          System.out.println("==========  compare ============");
  		if(al.equals(all)) {
  			System.out.println("Equal");
  		}
  		else {
  			System.out.println("NOT Equal");
  		}
  		
  		//join two array list
  		ArrayList<String> arrlist=new ArrayList<String>();
  		
  		System.out.println("==========  join ============");
  		// Engineer 
  		arrlist.add("harsha.s@globallogic.com");
  		arrlist.add("Trainee Software Engineer");
  		
  		arrlist.addAll(all);
  		Iterator ite = arrlist.iterator();
		  
        while (ite.hasNext())
            System.out.println(ite.next());
        
        System.out.println("==========  empty ============");
        //emptying
        all.clear();
        //checking id it is empty
        if(all.isEmpty()) {
        	System.out.println(""+ "No data available    \nall.clear();\nApplied");
        }

        System.out.println("========== trim ============");
		
		// sets the capacity of the arraylist equal to the number of elements in the arraylist
	
		al.trimToSize();
		Iterator iterator = al.iterator();
		
	
        while (iterator.hasNext())
            System.out.println(iterator.next());
        
        System.out.println("========== replace value ============");
        
        al.set(3, "vpuram");
       
        Iterator iter = al.iterator();
		
        while (iter.hasNext())
            System.out.println(iter.next());
        
        System.out.println("========== Increasing the size of arrlist ============");
        
        al.ensureCapacity(200);
        System.out.println("Size increased to 200");

        
		
	}
	

}
