package constructorone;

import constructorfour.Orderdetails;

public class Userdetails extends  Orderdetails{

	public Userdetails(int oid, String oname, String odescription, int price) {
		super(oid, oname, odescription, price);
	}

	@Override
	public String toString() {
		return "Orderdetails [oid=" + oid + ", oname=" + oname + ", odescription=" + odescription + "]";
	}

	public static void main(String[] args) {
		
		Userdetails userdetails=new Userdetails(111, "odescription", "odescription", 123);
		System.out.println(userdetails);
		
	}

}
