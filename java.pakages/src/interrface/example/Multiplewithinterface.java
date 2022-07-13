package interrface.example;

import java.util.*;
class Ex extends Multiplewithinterface{
	
public  void  change() {

	//error due to final
	
}


class exx extends Ex{
	
	
	
	
}
}
public class Multiplewithinterface implements Baseone,Basetwo{
	static Scanner  sc=new Scanner(System.in);//remove static for reference
	
	final static int usn;
	
	final static double pi;
	final static String name;
	final static String dob;
	
	static String namee = sc.next();
	static {
		usn=15;
		pi=3.14;
		name=namee;
		dob=sc.next();
	}
	public void change(){
		
	}
	public void Display() {
		//a=11; Error
		System.out.println("displaying");
	}
	@Override
	public void Displayone() {
		System.out.println("displaying one");
		
	}
	
	
	public static void main(String[] args) {
		
		

		
		//Baseone obj=new Multiplewithinterface();//typecasting
		Multiplewithinterface object=new Multiplewithinterface();
		object.Display();
		object.Displayone();
		
		System.out.println(name);
		System.out.println(usn);
		System.out.println(dob);
		System.out.println(pi);

		
	}

	

}


interface Baseone{
	int a=10;
	 void Display();
	
}
interface Basetwo{
	void Displayone();//by default public abstract
}

