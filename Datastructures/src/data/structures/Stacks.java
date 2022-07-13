package data.structures;

import java.util.Arrays;
import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
	

		Stack <String> s=new Stack<>();
		
		s.add("Harsha");
		s.add("Mahendarkar");
		s.add("Suresh");
		s.add("Mysore");
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		//System.out.println(s.pop());

		
		s.push("Harsha");
		s.push("Mahendarkar");
		s.push("Suresh");
		s.push("Mysore");
		System.out.println(s);
		
		s.push("Mysore");
		for(String stack:s)
		System.out.println(" "+stack);
		
		
		System.out.println("size: "+s.capacity());
		
		s.contains("Suresh");
		
		
		
	}

}
