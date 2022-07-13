package oom;
import java.util.*;
public class Emp {
//static demonstration
	static int empid,pincode;
   static String empfname,emplname,city,state;

	public static void main(String[] args) {
		//static members
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee id");
		empid=sc.nextInt();
		
		System.out.println("enter employee first name");
		empfname=sc.next();
		
		System.out.println("enter employee last name");
		emplname=sc.next();
		
		System.out.println("enter employee city");
		city=sc.next();
				
		System.out.println("enter employee state");
		state=sc.next();
		
		System.out.println("enter employee pincode");
		pincode=sc.nextInt();
		
		System.out.println("employee id = "+empid+
				"\nemployee first name ="+empfname+
				"\nemployee last name = "+emplname+
				"\nAddress = "+city+state+pincode);
	}

}
