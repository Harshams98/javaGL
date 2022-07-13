package javainheritance;

public class Superr {
	Superr(){
		System.out.println("Parent class");
	}
	//paramerterized 
	
	Superr(int a){
		System.out.println("parent class with parameter"+a);
	}
	
	

}
class base extends Superr{
	base(){
		super(5);
		//no need implicitly calls 
		System.out.println("BASE Class");
		
	}
	

public base(int i) {
		super();
		System.out.println("BASE with parameter");
	}
}
class Display{
public static void main(String []args) {
	Object h=99;
	new base(1);
	new base();
	}
}
