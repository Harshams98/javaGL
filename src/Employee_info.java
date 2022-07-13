package oom;
import java.util.*;
public class Employee_info {
	
	int empid,empdskno,pincode;
	String empfname,lastname,empdesig,location;
	
	public Employee_info(int empid,int empdskno,
	String empfname,String lastname,String empdesig,String location,int pincode) {
		this.empid=empid;
		this.empdskno=empdskno;
		this.empfname=empfname;
		this.lastname=lastname;
		this.empdesig=empdesig;
		this.location=location;
		this.pincode=pincode;
		
		System.out.println("empid = "+this.empid+"\ndesk = "+
		this.empdskno+"\nfirst name="+
		this.empfname+"\nlast name= "+
		this.lastname+"\nDesignation="+
		this.empdesig+"\nlocation="+this.location+
		"pincode="+this.pincode);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter employee id");
		int eid=sc.nextInt();
		
		System.out.println("enter employee desknumber");
		int edsk=sc.nextInt();
		
		System.out.println("enter employee first name");
		String efn=sc.nextLine();
		
		System.out.println("enter employee last name");
		String eln=sc.nextLine();
		
		
		System.out.println("enter employee designation");
		String edig=sc.nextLine();
		
		
		System.out.println("enter employee location");
		String loc=sc.next();
		
		System.out.println("enter employee pin");
		int pin=sc.nextInt();		
		
		Employee_info e=new Employee_info(eid,edsk,efn,eln,edig,loc,pin);

	}

}
