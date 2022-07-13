package assignment;

public class Employee extends Person {

	public Employee(String empname, double salary, int yoj, String insurencenum) {
		super(empname, salary, yoj, insurencenum);
		// TODO Auto-generated constructor stub
	}
	

	

}
class Person{
	String empname;
	double salary;
	int yoj;
	String insurencenum;
	public Person(String empname, double salary, int yoj, String insurencenum) {
	
		this.empname = empname;
		this.salary = salary;
		this.yoj = yoj;
		this.insurencenum = insurencenum;
	}
	
}
class Test {

	public static void main(String[] args) {
		Employee employee=new Employee("Harsha",550000,2022,"9Q6553");
		Employee employe=new Employee("veresha",3250000,2011,"9HJ6553");
		
		System.out.println(employee.empname);
		System.out.println(employee.salary);
		System.out.println(employee.yoj);
		System.out.println("==========================");
		System.out.println(employe.empname);
		System.out.println(employe.salary);
		System.out.println(employe.yoj);
	}

}
