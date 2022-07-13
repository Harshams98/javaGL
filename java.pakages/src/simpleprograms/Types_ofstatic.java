package simpleprograms;

public class Types_ofstatic {

}
class Staticclass {
	//static keyword can be used with class, method and block
	//static members belong to the class instead of specific instance.
	//this means if you make a member static, you can access it without an object
	
	static void myMethod() {
		System.out.println("Class method");
	}
	
	//static members || variables
	static int number;
	static String name;
	static float decimal;
	static double digit;
	
	//static block
	static {
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		System.out.println("1234567890");
		number=96666;
		name="Sachin A";
		decimal=3.142f;
		digit=1234.12345;
	}	
	static {
		String code="Programming is fun";
		String statement = "We are leaning static keyword";
		String city="I belong to Bidar, Karnataka";
		System.out.println(code);
		System.out.println(statement);
		System.out.println(city);
	}
	static {
		int integer=234;		
		System.out.println("----------------------------");
		System.out.println(integer);
	}
	static {
		float digit=3.457f;
		boolean result=true;	
		System.out.println("-----------------------------");
		System.out.println(digit);
		System.out.println(result);
	}
	
	int num=200;
	static void display() {
		System.out.println("This statement belong to static method");
		System.out.println("This statement belong to static method");
		System.out.println("This statement belong to static method");
		System.out.println("This statement belong to static method");
		
	}
	//non-static method
	static void fun() {
		System.out.println("This is from non-static method");
		System.out.println("Calling the static method from here");
		System.out.println("==================");
		display();//calling static
	}

	
	public static void main(String[] args) {
		myMethod();	
		System.out.println(number);
		System.out.println(name);
		System.out.println(decimal);
		System.out.println(digit);
		System.out.println("=====================");
		
		fun();//calling astatic method tht calls other static method
	}
}