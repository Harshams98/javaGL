//package exceptionhandling;
//
//public class ThrowingException {
//
//	void productcheck(int weight) throws InvaidproductException {
//		if(weight<100) {
//			throw new InvaidproductException("Product invalid");
//		}
//		
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//custom exception
//		ThrowingException obj=new ThrowingException();
//		try {
//			obj.productcheck(65);
//		}
//		catch(InvaidproductException e)
//		{
//			System.out.println("caught the exception using custom");
//			System.out.println(e.getMessage());
//		}
//
//	}
//	
//
//}
//
//class InvaidproductException extends Exception{
//	
//	public InvaidproductException(String s) {
//		super(s);
//		}
//	
//}
