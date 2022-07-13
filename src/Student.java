package oom;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	int stuid,studskno,pincode;
	String stufname,lastname,empdesig,location;
	public Student(int stuid, int studskno, int pincode, String stufname, String lastname, String empdesig,
			String location) {
		super();
		this.stuid = stuid;
		this.studskno = studskno;
		this.pincode = pincode;
		this.stufname = stufname;
		this.lastname = lastname;
		
		this.location = location;
	}
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", studskno=" + studskno + ", pincode=" + pincode + ", stufname=" + stufname
				+ ", lastname=" + lastname + ", empdesig=" + empdesig + ", location=" + location + "]";
	}

}
