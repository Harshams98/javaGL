package assignment;
import java.util.*;
public class Calulator {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("----------CALCULATOR---------");
		boolean bool=true;
		while(bool) {
			System.out.println("\nEnter first number");
			int numone=sc.nextInt();
			System.out.println("Enter second number");
			int numtwo=sc.nextInt();
			
			System.out.println("Enter your choice \n 1.addition"
					+ "\n 2.subtraction \n 3.multiplication \n 4.division \n 5.mod"
					+ "\n 6.exit");
			int choice=sc.nextInt();
			System.out.print("\nresult = ");
			int r=0;
			switch(choice) {
			case 1:
				r=numone+numtwo;
				System.out.println(r);
				break;
			case 2:
				r=(numone-numtwo);
				System.out.println(r);
				break;
			case 3:
				r=(numone*numtwo);
				System.out.println(r);
				break;
			case 4:
				r=(numone/numtwo);
				System.out.println(r);
				break;
			case 5:
				r=(numone%numtwo);
				System.out.println(r);
				break;
			case 6:
				bool=false;
				System.out.println("thankyou");
				break;
				default:
					System.out.println("invalid option!!!");
			}
			
		}
		sc.close();
		


	}

}
