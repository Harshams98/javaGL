package simpleprograms;
import java.util.*;

import Collections.Linkedlist;
public class Person {
	String name,address;

	public Person(String name, String address) {
		
		this.name = name;
		this.address = address;
	
	}
Person son;
Person father;

Person  topmost() {
	
	return father;
	
	
}
Person youngest() {
	
return son;
	
	
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person arr[]=new Person[11];
		
		arr[0]=new Person("harsha","mysore");
		arr[1]=new Person("suresh","mysore");
		arr[2]=new Person("krishnoji","sargur");
		arr[3]=new Person("veer","mumbai");
		arr[4]=new Person("rohan","delhi");
		arr[5]=new Person("deepak","gurgav");
		arr[6]=new Person("guru","banglore");
		arr[7]=new Person("vinod","bihar");
		arr[8]=new Person("rakshith","mandya");
		arr[9]=new Person("sahas","sargur");
		arr[10]=new Person("meena","delhi");
		

		for(int i=1;i<10;i++)
		{
			arr[i].son=arr[i+1];
			arr[i].father=arr[i-1];
		}
		
		Person youngest=arr[5].youngest();
		
		LinkedList<Person> li=new LinkedList();
		
		li.add(arr[0].son);
		li.add(arr[1].father);
		li.add(arr[2].son);
		li.add(arr[3].father);
		li.add(arr[4].son);
		li.add(arr[5].father);
		li.add(arr[6].father);
		li.add(arr[7].son);
		li.add(arr[8].father);
		li.add(arr[9].son);
		li.add(arr[10].father);
		
		
System.out.println(li);
		
	
			

			System.out.println(li.getLast());
			System.out.println("top most = "+arr[1].topmost().name);
			//System.out.println("top most = "+arr[1].father.topmost().name);
			
			System.out.println("youngest="+arr[6].youngest().name);
		
		
		

	}

}
