package method.references;


@FunctionalInterface
interface MethodRefNonStatic{
	void disp();
}

//reference to the constructor

interface MethodConst{
	void constr();
}

class Constclass{
	Constclass(){
		System.out.println("hello this is constructor reference");
	}
}

public class MethodReferenceNonStatic {
	
	public void sayhello() {
		System.out.println("hello this is non static reference");
	}

	public static void main(String[] args) {
	
		//creating method
		MethodReferenceNonStatic refnonstatic=new MethodReferenceNonStatic();
		//refering to non static method using reference
		MethodRefNonStatic methodrefnonstatic=refnonstatic::sayhello;
		
		//calling sayhello using functional interface
		methodrefnonstatic.disp();
		
		//interface iname = classname::asigning using new keyword
		MethodConst msg=Constclass::new;
		////calling const using functional interface
		msg.constr();
		

	}

}
