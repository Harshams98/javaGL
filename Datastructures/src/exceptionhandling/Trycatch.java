package exceptionhandling;

public class Trycatch {

	public static void main(String[] args) {
		
		
		try {
			int arr[]=new int[4];
			System.out.println();
		
			arr[0]=8;
			arr[1]=2;
			arr[2]=5;
			arr[3]=6;
			//exceeding index
			arr[4]=8/0; 
			//doesn't print
			for(int i:arr)
				System.out.println(i);	
			
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception ");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception ");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception");
			System.out.println("Exception handled");
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Hello");
		}
		
		System.out.println("\nTry to divide by zero :");
		try {
			int a=10/0;
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception ");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception ");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception");
			System.out.println("Exception handled");
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Hello");
		}
		finally {
			System.out.println("\nThis is Finally block");
		}
		System.out.println("Out of try - catch - finally");

	}

}
