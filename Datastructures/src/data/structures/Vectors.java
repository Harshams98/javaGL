package data.structures;

import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector <String>fruits=new Vector<String>(2,1);
		fruits.addElement("Apple");
		fruits.addElement("Grapes");
		fruits.addElement("Mango");
		fruits.addElement("Kiwi");
		fruits.add("Blueberry");
		fruits.add("Berry");
		
		
		System.out.println(fruits);
		System.out.println(fruits.capacity());

	}

}
