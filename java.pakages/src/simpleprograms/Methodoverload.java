package simpleprograms;
class Inherri {
	void display(int a) {//not print overriding
		System.out.println("parent with int "+a+" parameters");
	}
	void display(float a,char b) {
		System.out.println("with float "+a+" and char "+b+" parameters");
	}
}
public class Methodoverload extends Inherri {

	void display() {
		System.out.println("no parameters");
	}
	//difference in datatype
	void display(int a) {
		System.out.println("with int "+a+" parameters");
	}
	
	//difference in datatype
	void display(float a) {
		System.out.println("with float "+a+" parameters");
	}
	void display(char a) {
		System.out.println("with char "+a+" parameters");
	}
	////difference in datatype sequence
	void display(int a,float b) {
		System.out.println("int "+a+" and float "+b+" parameters");
	}
	///difference in datatype sequence
	void display(float a,int b) {
		System.out.println("float "+a+" and int "+b+" Sequence change parameters");
	}
	public static void main(String[] args) {
		
		
		Methodoverload obj=new Methodoverload();
		obj.display();
		obj.display(2);
		obj.display('H');
		obj.display(1.332f,'f');
		obj.display(2.4f);
		obj.display(2,3.7f);
		obj.display(1.332f,6);

	}

}
