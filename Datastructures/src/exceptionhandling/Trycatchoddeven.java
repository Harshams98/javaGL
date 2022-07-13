package exceptionhandling;

import java.util.*;

public class Trycatchoddeven {

	public static void main(String[] args) {

		//creating a scanner object
		Scanner sc=new Scanner(System.in);
		
		//try Block
		try {
			//ODD EVEN Check
		while(true) {
				System.out.println("Enter a number :");
				int num=sc.nextInt();
				if(num%2==0) {
					System.out.println("The Number "+num+" is EVEN");
				}
				else {
					System.out.println("The Number "+num+" is ODD");
					
				}
			}
		}
		//Multiple Catch Blocks
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
			System.out.println("Type Mismatch Exception occoured");
		}
		
		//Finally Block
		finally {
			System.out.println("\n This is Finally Block");
		}

	}

}
