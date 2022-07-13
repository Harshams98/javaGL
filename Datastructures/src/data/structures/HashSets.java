package data.structures;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class HashSets {

	public static void main(String[] args) {
		
		//creating a hash set
		HashSet <String>fruits=new HashSet<String>();
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Mango");
		fruits.add("Kiwi");
		fruits.add("Blueberry");
		fruits.add("Berry");
		
		System.out.println(fruits);
		
		//searching boolean <returntype>
		if(fruits.contains("Apple")) {
			System.out.println("The hashset contains Apple");
		}else {
			System.out.println("The hashset does not contains Apple");
			
		}
		//size method
		System.out.println("size : "+fruits.size());
		

		
		//using iteration
		Iterator it=fruits.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		//removing
		fruits.remove("Berry");
		
		System.out.println(fruits.toString().valueOf(fruits));
		
	}

}
