package exceptionhandling;

public class Nestedtrycatch {
	void productcheck(int weight) throws InvaidproductException {
		if(weight<100) {
			throw new InvaidproductException("Product invalid");
		}
		
	}

	public static void main(String[] args) {

		//custom exception
		Nestedtrycatch obj=new Nestedtrycatch();
		
		//try -catch inside try block
		try {
			int num=8/8;
		
		//Nested try block	
		try {
			int number=7/0;
		}
		catch(Exception e){
			System.out.println("Arithmetic Exception Caught in Nested Block");
			
		}
		try {
			obj.productcheck(65);
		}
		catch(InvaidproductException e)
		{
			System.out.println(" nested block");
			System.out.println("caught the exception using custom");
			System.out.println(e.getMessage());
		}
	
		}
		//Main try
	catch(Exception e) {
			System.out.println("1st try block");
		}

	}
	

}

class InvaidproductException extends Exception{
	
	public InvaidproductException(String s) {
		super(s);
		}
	
}
