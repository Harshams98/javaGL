package Inheritencewithconst;
public class Inheritancewthconst {

//member creation
	int idnum;
	String firstname,lastname,city,state;
	
	//constructor with parameters 
	public Inheritancewthconst(int idnum, String firstname, String lastname, String city, String state) {
	
		this.idnum = idnum;
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
		this.state = state;
	}

	public static void main(String[] args) {
		
		// creating object for child class
		Inhertedconst i;
		
		//initializing object
		i=new Inhertedconst(101, "Harsha", "mahendarkar","mysore", "karnataka");
		System.out.println(i.idnum);
		System.out.println(i.firstname);
		System.out.println(i.lastname);
		System.out.println(i.city);
		System.out.println(i.state);
	}

} 
 class Inhertedconst extends Inheritancewthconst{
//creating an const for subclass and passing value
	public Inhertedconst(int idnum, String firstname, String lastname, String city, String state) {
		//calling constructor of parent class
		//using super keyword
		super(idnum, firstname, lastname, city, state);
	}
	 
 }

