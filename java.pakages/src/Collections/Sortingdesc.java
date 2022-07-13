package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Sortingdesc {

	public static void main(String[] args) {
		
		ArrayList<String> countries=new ArrayList<String>();
		
		countries.add("India");
		countries.add("Japan");
		countries.add("Usa");
		countries.add("Denmark");
		countries.add("America");
		
		ArrayList<String> colors=new ArrayList<String>();
		
		colors.add("White");
		colors.add("Green");
		colors.add("Blue");
		
		
		//for each loop
		for(String ite:countries) {
			System.out.println(ite);
		}
		System.out.println("^^^^^^^^^^^^^Ascending sorting^^^^^^^^^^^^^^^");
		
		Collections.sort(countries);
		
		//for each loop ascending order
		for(String ite:countries) {
			System.out.println(ite);
		}
		
		System.out.println("^^^^^^^^^^^^^^Descending sorting^^^^^^^^^^^^^^");
		Collections.reverse(countries);//elements
		//reverseOreder is reverse total orrder
		
		//for each loop descnding order

		for(String ite:countries) {
			System.out.println(ite);
		}
		System.out.println("^^^^^^^^^^^^^^add all^^^^^^^^^^^^^^");
		
		//Adding 2 ArrayList using addAll
		countries.addAll(colors);
		System.out.println(countries);

		System.out.println();
		
		ArrayList<String> arr=new ArrayList<>(countries.subList(0, 3));//exclude index3
		System.out.println("Arraylist sublist "+arr);
		
		System.out.println();
		
		List lii=countries.subList(1, 4);
		System.out.println("List sublist "+lii);
	}

}
