package Collections;
import java.util.*;
public class Swaparraylist {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Harsha");
		list.add("raju");
		list.add("giri");
		list.add("Suresh");
		
		System.out.println("Before swap");
		
		for(String name:list)
			System.out.println(name);
		
System.out.println("\nafter swap");
		Collections.swap(list, 2, 3);
		for(String name:list)
			System.out.println(name);

	}

}
