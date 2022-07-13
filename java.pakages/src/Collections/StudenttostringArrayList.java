package Collections;

public class StudenttostringArrayList {
	private int usn;
	private String name;
	private String college;
	private String city;
	private int pin;
	
	//creating parameterized constructor
	public StudenttostringArrayList(int usn, String name, String college, String city, int pin) {
		super();
		this.usn = usn;
		this.name = name;
		this.college = college;
		this.city = city;
		this.pin = pin;
	}

	//converting to String
	@Override
	public String toString() {
		return "Student Info : [usn=" + usn + ", name=" + name + ", college=" + college + ", city=" + city
				+ ", pin=" + pin + "]";
	}
	

	

}
