package simpleprograms;


//implementing interface using implements keyword
public class Inrerrfaces implements Theinterface {

	@Override
	public void display(String name) {
		System.out.println("MY NAME IS : "+name);
		}

	@Override
	//Odd or even using override interface method
	public void display(int num) {
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.println(i+" is even");
			}
			else {
				System.out.println(i+" is odd");
			}
		}
		
	}

	@Override
	//decimal or not using override interface method
	public void display(float value) {
		if(value%5==0) {
			System.out.println(value+"  is a decimal value");
		}
		else
		{
			System.out.println(value+"  is not a decimal value");
		}
	}

	@Override
	public void display(double value) {
		System.out.println(value +" is a double value");
		
	}

	@Override
	//voting eligibility using override interface method
	public void display(long age) {
		if(age>=18)
		System.out.println("your age ("+age+") is eligible for voting");
	else 
		System.out.println("your age ("+age+") is not eligible for voting");
	}

	@Override
	public void display(char ch) {
		System.out.println(ch+" is an Beautiful letter");	
	}
	public static void main(String[]args) {
	
		Theinterface obj=new Inrerrfaces();
		obj.display("Harsha");
		obj.display('Q');
		obj.display(10);
		obj.display(40f);
		obj.display(290.4246);
		obj.display(22l);	
	}
}

//creating an iterface
interface Theinterface{
	
	//methods without body
	public void display(String name);
	public void display(int num);
	public void display(float value);
	public void display(double value);
	public void display(char ch);
	public void display(long age);
}