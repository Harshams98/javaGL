package TostringArrayList;

import java.util.ArrayList;

import Collections.ArraytoString;

public class TostringArrayListt {

	public static void main(String[] args) {
		

		ArrayList<ArraytoString> arraylist=new ArrayList<ArraytoString>();
		
		//import Collections.ArraytoString to add constructor parameters
		arraylist.add(new ArraytoString(2525876, "Harsha", "TraineeSE", 99));
		
		//import Collections.ArraytoString to add constructor parameters
		arraylist.add(new ArraytoString(276, "suresha", "SE", 5));
		
		//using class object to iterate
	for(ArraytoString disp:arraylist) {
		System.out.println(disp);
	}
	
	
	}

}
