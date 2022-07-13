package javainheritance;

public class Hybrid implements B,C{

	public static void main(String[] args) {
Hybrid hybrid=new Hybrid();
hybrid.m1();
hybrid.m2();
hybrid.m3();
	}

	@Override
	public void m1() {
		System.out.println("m1");
		
	}

	@Override
	public void m3() {
		System.out.println("m2");
		
	}

	@Override
	public void m2() {
		System.out.println("m3");
		
	}}
	
	interface A{
		void m1();
		
	}
interface B extends A{
	void m2();
	
}
interface C extends A{
	void m3();
	
}



