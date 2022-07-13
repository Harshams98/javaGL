package data.structures;

import java.util.Hashtable;

public class HashTables {
	//Enumaration<Integer> names;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Double,Integer> ht=new  Hashtable<Double,Integer> ();
		
		Hashtable<String,Integer> htt=new  Hashtable<String,Integer> ();
		
		Hashtable<Integer,String> hashtable=new  Hashtable<Integer,String> ();
		
	
	//Wont work dont allow null value or null key unlike hashmap
	//ht.put(2.7, null); 
		//ht.put(null,8);
		System.out.println(ht);
		
		hashtable.put(7, "Dhoni");
		hashtable.put(37, "jadeja");
		hashtable.put(18, "Kholi");
		hashtable.put(10, "Sachin");
		hashtable.put(99, "Ashwin");
		
		//iterate

		System.out.println(hashtable);
		
		
	}

}
