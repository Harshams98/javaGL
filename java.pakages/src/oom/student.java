package oom;

public class student {
	//static members
	
	static int a=10;
	//static block
	static {
		
		System.out.println("This is a static block");
	}
	
	//static method
	public static void dispaly() {
		System.out.println("this is from static method ");
		System.out.println("this is from static method ");
		System.out.println("this is from static method ");
	}
	
	//non static calling a static method
	void nostatic() {
		System.out.println("this is a non static method ");
				System.out.println( "which is calling a static method");
		
		dispaly();
	}
	static void nostatic1() {
		System.out.println("this is a another static method  ");
				System.out.println( "static method 1 calling a static method 2");
				
		dispaly();
		
	}
	public static void main(String[]args) {
		//Scanner sc=new Scanner(System.in);
		System.out.println("-----------");
		System.out.println("This is a static member"+a);
		
		System.out.println("-----------");
		student s=new student();
		s.nostatic();
		System.out.println("-----------");
		nostatic1();
		
	}

}
