package construtorthree;

public class Productdetails {
	int pid;
	String pname,pdescription;
	int price;

	public Productdetails(int pid, String pname, String pdescription, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdescription = pdescription;
		this.price = price;
	}

	public static void main(String[] args) {
		Productdetails productdetails=new Productdetails(1001, "iphone", "14 series", 78000);

		System.out.println(productdetails.pid);
		System.out.println(productdetails.pname);
		System.out.println(productdetails.pdescription);
		System.out.println(productdetails.price);
	}

}
