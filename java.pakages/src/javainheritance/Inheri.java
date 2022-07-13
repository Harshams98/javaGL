package javainheritance;

public class Inheri {
int usn;
String name;
String gmail;
double cgpa;
long phno;
String Address;



public Inheri(int usn, String name, String gmail, double cgpa, long phno, String Address) {
	this.usn = usn;
	this.name = name;
	this.gmail = gmail;
	this.cgpa = cgpa;
	this.phno = phno;
	this.Address = Address;
}



@Override
public String toString() {
	return "Details [\nusn = " + usn + "\nname = " + name + ""
			+ "\ngmail = " + gmail + "\ncgpa=" + cgpa + ", "
			+ "\nphno = "+ phno
			+ "\nAddress = " + Address + "]";
}


}
