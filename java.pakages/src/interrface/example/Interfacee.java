package interrface.example;

public class Interfacee implements f,f1{

	@Override
	public void f11() {

		System.out.println("its from f");
		
	}

	@Override
	public void ff() {

		System.out.println("its from f1");
		
	}
	public static void main(String []args) {
		Interfacee i=new Interfacee();
		i.f11();
		i.ff();
	}

}
interface f{
	void ff();
	}
interface f1{
	void f11();
	}
