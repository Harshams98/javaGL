package oom;
import java.util.*;
public class Equales {
	
public static void main(String[]args) {
	
	//sc is an object
	Scanner sc=new Scanner(System.in);
	System.out.println("enter age for voting");
	int age=sc.nextInt();
	if(age>=18) {
		System.out.println("ELIGIBLE FOR VOTING");
				
	System.out.println("enter 1st number");
	int a=sc.nextInt();
	System.out.println("enter 2nd number");
	int b=sc.nextInt();

	if(a==b) {
			System.out.println(a+" and "+b+"  are Equal");
		}
		else {
			System.out.println(a+" and "+b+"  are NOT EQUAL");
		}
	}
	else {
		System.out.println("NOT ELIGIBLE FOR VOTING");
	}
	sc.close();
	

}
}



