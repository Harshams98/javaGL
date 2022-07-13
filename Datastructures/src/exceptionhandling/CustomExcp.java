package exceptionhandling;

public class CustomExcp {

	public static void main(String[] args) {

		try {
			throw new MyException("The custom Exception occoured");
			
		}catch(MyException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}

}

class MyException extends Exception{
	String name;
	//const
	MyException(String name){
		
		//const of parent class returns to string getmsg
		super(name);
		
		this.name=name;
		
	}
	
	public String toString() {
		return "myException [name=" + name + "]";
	}
	
	
}
