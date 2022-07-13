package assignment;
import java.util.*;
public class Floatnum {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number");
		float numm=sc.nextFloat();
		if(numm==0)
			System.out.println("zero");
		else if(numm>0) {
			System.out.println("positive");
			if(numm<1)
				System.out.println("small");
			else if(numm>1000000)
				System.out.println("large");
		}
		else if(numm<0) {
			System.out.println("negetive \nsmall");
		}
		sc.close();

	}

}
