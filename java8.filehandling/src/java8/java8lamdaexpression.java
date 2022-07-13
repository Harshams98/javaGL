package java8;

interface Addition {

	public void disp();
	
}
interface Display{
	//return type is used in lambda
	public String display();
	 static void testing() {
		System.out.println("This stmt is from inter face using default keyword");
	}
}

public class java8lamdaexpression {

	public static void main(String[] args) {

		//without lambda
		Addition add=new Addition() {//empty apace//jun 12 5.52
			public void disp() {

				System.out.println("Addition without  lamda");
			
			}
		};
		add.disp();
		
		//with lambda
		Addition obj=()->{
			System.out.println("Addition with lamda");
		};
		obj.disp();
		
		//with lambda
		Display object=()->{
			return "hello this is string";
		};
		System.out.println(object.display());
		
		//toString();
	}
	

}
