package has_a;

public class Address {
	//member declare 
	int hno,pin;
	String hname,hstreet,areaname,landmark,city,state;
//parameterized constructor
	public Address(int hno,  String hname, String hstreet, String areaname, String landmark,
			int pin,String city,
			String state) {
		//super();
		this.hno = hno;
		
		this.hname = hname;
		this.hstreet = hstreet;
		this.areaname = areaname;
		this.landmark = landmark;
		this.pin = pin;
		this.city = city;
		this.state = state;
		
	}
}
class Aggrigation{
	int stuid;
	String name;
	//creating a HAS-A relationship
	Address stuadd;
	
	public Aggrigation(int stuid, String name,Address address) {
		super();
		this.stuid = stuid;
		this.name = name;
		this.stuadd=address;
	}
	public static void main(String[] args) {
		//creating a object for Address class to assign values to members
		Address add=new Address(56,"nilay","13th cross","vidyaranya","near hostel",
				570008,"mysore","karnataka");
		
		//implementing add object 
		//one class calling other class
		Aggrigation ag=new Aggrigation(15, "harsha", add);
		
		System.out.println("student name = "+ag.name);
		System.out.println("Rollno = "+ag.stuid);
		System.out.println("\naddress :");
		System.out.println("home no: "+ag.stuadd.hno);
		System.out.println("street: "+ag.stuadd.hstreet);
		System.out.println("area: "+ag.stuadd.areaname);
		System.out.println("landmark: "+ag.stuadd.landmark);
		System.out.println("pincode: "+ag.stuadd.pin);
		System.out.println("city: "+ag.stuadd.city);
		System.out.println("state: "+ag.stuadd.state);
		


	}
	
	
	
}
