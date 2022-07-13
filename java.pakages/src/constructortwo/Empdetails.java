package constructortwo;

public class Empdetails {
	int empid;
	String fname;
	String lname;
	String city;
	String State;
	

	public Empdetails(int empid, String fname, String lname, String city, String state) {
		super();
		this.empid = empid;
		this.fname = fname;
		this.lname = lname;
		this.city = city;
		State = state;
	}


	


	public static void main(String[] args) {
		Empdetails userdetails=new Empdetails(90,"harsha","mahenadrkar","mysore","karnataka");

		System.out.println(userdetails.empid);
		System.out.println(userdetails.fname);
		System.out.println(userdetails.lname);
		System.out.println(userdetails.city);
		System.out.println(userdetails.State);
	}

}