package data.structures;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Integer,String>hp=new HashMap<Integer,String>();
		hp.put(1, "Mysore");
		hp.put(15, "Harsha");
		hp.put(61, "Mahendarkar");
		hp.put(70000, "Suresh");
		
		//allows null value and null key
		hp.put(null, null);
		hp.put(null,"Sush");
		hp.put(45, null);
		System.out.println(hp);
		System.out.println(" :"+hp.get(15));
		System.out.println(" :"+hp.get(61));
		System.out.println(" :"+hp.get(70000));
		
		   for(Map.Entry m:hp.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
			   }

	}

}
