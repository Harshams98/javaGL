package method.references;


@FunctionalInterface
interface Display{
	void displaystatic();
}


class Display2ndmethod{
	
	static void displaystatic() {
		System.out.println("this is a static refering to funal interface using another class");
	}
	
}



public class Methodref {
	
	public static void Saysmtng() {
		System.out.println("this is a static refering to funal interface");
	}
	

	public static void main(String[] args) {
		
		
		Display dissp=Methodref::Saysmtng;
		dissp.displaystatic();
		
		//2nd method
		//:: is a scope variable
		Display disp2ndm=Display2ndmethod::displaystatic;
		disp2ndm.displaystatic();
		

	}

}
