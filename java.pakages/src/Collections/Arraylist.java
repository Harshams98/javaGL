package Collections;
import java.util.ArrayList;
import java.util.*;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {

ArrayList<String> countries=new ArrayList<String>();
		
		countries.add("India");
		countries.add("Japan");
		countries.add("Usa");
		countries.add("Denmark");
		countries.add("America");
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
//	wont work	//li.addAll(countries);
		//indexing starts from zero
		li.remove(Integer.valueOf(55));
		li.remove(5);
		
		System.out.println("Before sorting");
		System.out.println(li);
		
		System.out.println("After sorting");
		//foreach
		for(int sort:li)
			System.out.println(sort);
		
		
		
		
		//li.sort(null);//works
		Collections.sort((li));//this alsoworks
		System.out.println((li));
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		System.out.println("last index= "+li.lastIndexOf(50));
		
		
		//searching contents
		System.out.println("the li list contains 50"+
		li.contains(5));
		
	
		//arrys
		int a[]= {2,3,1,44,11,467,8};
		
		Arrays.sort(a);
		System.out.println("sorted array using 'Arrays' package");
		System.out.println(Arrays.toString(a));
		
		
		
		
		
		
		
		
		
		System.out.println("----------sorted arraylist-------");
		List lii=new ArrayList<>();
		lii.addAll(countries);
		
		for(Object o:lii)
			System.out.println(o);
		
		
	}
}
