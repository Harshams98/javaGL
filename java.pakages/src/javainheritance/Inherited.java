package javainheritance;
import java.util.*;
public class Inherited extends Inheri{
	
	public Inherited(int usn, String name, String gmail, double cgpa, long phno, String address) {
		super(usn, name, gmail, cgpa, phno, address);
		// TODO Auto-generated constructor stub
	}


	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);	
		System.out.println("enter usn");
		int usn=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter gmail");
		String gmail=sc.next();
		System.out.println("enter cgpa");
		double cgpa=sc.nextDouble();
		System.out.println("enter phone number");
		long phno=sc.nextLong();
		System.out.println("enter address");
		String Address=sc.next();
		
		
		Inherited i=new Inherited(usn, name, gmail, cgpa, phno, Address);
		System.out.println(i.toString());
	}
	

}
