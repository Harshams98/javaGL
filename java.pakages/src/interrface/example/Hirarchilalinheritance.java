package interrface.example;

class MainParent{
	 int a=90;
MainParent(){
	 
		System.out.println("\nPARENT WILL PRINT AGAIN AND AGAIN");
	}	
}

class subone extends MainParent{
	int a=0;
	subone(){
		this.a=super.a;//supermember
		System.out.println("This is a first sub class class"+a);
	}
}

class subtwo extends MainParent{
	subtwo(){
		System.out.println("This is a second sub class class");
	}
}

class subthree extends MainParent{
	subthree(){
		System.out.println("This is a third sub class class");
	}
}

public class Hirarchilalinheritance {

	public static void main(String[] args) {
	new subone();
	new subtwo();
	new subthree();

	}

}
