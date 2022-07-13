package DSA;
import java.util.Stack;
import java.util.*;

public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s=new Stack();
		
		//s.add("harsha");
		s.push(4);
		int add=(int) s.peek();//explicit type conversion
		
		Object f=7+8;
		add=(int)f+add;//explicit type conversion
		System.out.println(add);
				//Specifying data type

		
		//s1.push("hash");//Error bcoz stack has an data type
		
		
		Stack<Integer> s1=new Stack<>();
		s1.push(1);
		s1.push(4);
		s1.push(3);
		s1.push(2);
		s1.push(1);
		s1.pop();
		if(!s1.isEmpty())
			System.out.println(s1);
		
		//returns int value of index pos start from 1 not 0 index
		System.out.println(s1.peek());

		//iterate we have to call iterate class
		Iterator i=s1.iterator();//no new keyword needed
		
		while(i.hasNext()) {
			System.out.println(i.next());//return has an object
		}
		System.out.println(s1.size());
		s1.sort(null);
		
		System.out.println(s1);
		
	}

}
