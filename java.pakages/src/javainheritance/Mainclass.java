package javainheritance;
import java.util.*;

//parent class
public class Mainclass {
	
	//even or odd check 
	//method with parameter
	void even(int number) {
		if(number%2==0)
			System.out.println("its an even number");
		else
		System.out.println("its an odd number");

	}
	
	//20 numbers even or odd Without parameters
	void evennos() {
		for(int i=1;i<=20;i++) {
			if(i%2==0)
				System.out.println(i+ " is even");
			else
				System.out.println(i+ " is odd");
		}
	}
	
	//largest among three with parameters 
	void largest(int numone,int numtwo,int numthree) {
		System.out.print("largest is = ");
		
		//condition to check largest
		if((numone>numtwo)&&(numone>numthree))
		System.out.println(numone);
		else if((numtwo>numthree)&&(numtwo>numone))
			System.out.println(numtwo);
		else
			System.out.println(numthree);
	}
	
	
	//eligible for voting or not
	void voting(int age)
	{
		if(age>=18) {
			System.out.println("your Age is Eligible for voting");
		}
		else
		{
			System.out.println("your age is Not Eligible for voting");
		}
	}
	
	
	public static void main(String[] args) {
		
		// taking i/p stream
		Scanner sc=new Scanner(System.in);
		
		//creating subclass object
		Derivedclass logic=new Derivedclass();
		
		System.out.println("enter a number to check its even or not");
		//calling method to check even or not
	    logic.even(sc.nextInt());
	    
		System.out.println("-------------------");
		//calling method to print 20 even or odd
		logic.evennos();
		
		System.out.println("-------------------");
		System.out.println("enter 1st whole number");
		int numone=sc.nextInt();
		System.out.println("enter 2nd whole number");
		int numtwo=sc.nextInt();
		System.out.println("enter 3rd whole number");
		int numthree=sc.nextInt();
		
		//calling method to check largest of 3
		logic.largest(numone, numtwo, numthree);
		
		System.out.println("-------------------");
		System.out.println("enter age to check voting eligibility");
		//calling method to check voting eligibility
		logic.voting(sc.nextInt());
		sc.close();
	}
	

}
//child class
class Derivedclass extends Mainclass{
	
}
