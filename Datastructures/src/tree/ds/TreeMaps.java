package tree.ds;


import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {

	public static void main(String[] args) {

		//importing treemap from util and instantiate 
		TreeMap <Integer,String>tm=new TreeMap<Integer,String>();
		tm.put(1, "Mysore");
		tm.put(61, "Banglore");
		tm.put(15, "Harsha");
		tm.put(61, "Mahendarkar");
		tm.put(4000, "Suresh");
		
		//Does not allows null value and null key
//		tm.put(null,"Sush");
//		tm.put(45, null);
		
		System.out.println(tm);
		//get method
		System.out.println(" :"+tm.get(15));
		System.out.println(" :"+tm.get(61));
		System.out.println(" :"+tm.get(8690));

		if(tm.containsKey(15)) {
			System.out.println("TreeMap Key contains [15]:"+tm.get(15));
		}else {
			System.out.println("Not found");
		}
		
		//iterate 
		   for(Map.Entry m:tm.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
			   }

		   //First element
		   System.out.println("First Element :"+tm.firstEntry());
	
		   //last element
		   System.out.println("Last Element :"+tm.lastEntry());
	}

}
