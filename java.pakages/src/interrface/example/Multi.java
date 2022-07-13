package interrface.example;

public class Multi implements Sub{


	public void Display() {
		System.out.println("displaying");
	}
	
	@Override
	public void Displayone() {
		System.out.println("displaying the one");		
	}
	public static void main(String[] args) {
		//Baseone obj=new Multiplewithinterface();//typecasting
		Multi object=new Multi();
		object.Display();
		object.Displayone();	
Sub.disp();
	}
}

interface Baseone0{
	 void Display();
	
}
interface Basetwo0{
	void Displayone();//by default public abstract
}
interface Sub extends Baseone0,Basetwo0{//impliments not work only extends
	static void disp() {
		System.out.println("from interface");
	}
}

