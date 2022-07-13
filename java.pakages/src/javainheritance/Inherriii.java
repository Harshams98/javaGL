package javainheritance;

public class Inherriii {
int a=10;
Inherriii(){System.out.println("++++++++++++++++");
	
}
 void inn() {
	System.out.println("============");
}
	public static void main(String[] args) {

		Isa i=new Isa();
		System.out.println(i.a);
		i.innn();
		
		
	}

}
class Isa extends Inherriii{
	int a =100;
	Isa (){
		super();
	}
	  void innn() {
		System.out.println("-----------------");
		super.inn();
		
	}

}
