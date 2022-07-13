package java8;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Multibrtwo{
int multi(int a,int b);	
}

@FunctionalInterface
interface Concatstring{
	//function abstract function implementation
	String concat(String one,String two);
}


public class Lambdawithsinglepara {

	public static void main(String[] args) {

		Multibrtwo obj=(parameterone,parametertwo)->parameterone*parametertwo;
		System.out.println(obj.multi(4,7));
		
		Concatstring name=(firstname,lastname)->firstname+lastname;
		System.out.println(name.concat("Harsha ", "Mahendarkar"));
		
		List <String> names=new ArrayList<String>();
		names.add("Harsha");
		names.add("Mahendarkar");
		names.add("Suresh");
		
		//normal iterate
		for(String a:names)
			System.out.println(a);
		
		System.out.println();
		
		//lambda iterator
		names.forEach((res) -> System.out.println(res));//function inside function using lambda
		
	
	}

}
