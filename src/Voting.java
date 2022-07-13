package oom;
import java.util.*;
public class Voting {

	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter age for voting");
		int age=in.nextInt();
		
		if(age>=18) {
			System.out.println("ELIGIBLE");
		}
		else {
			System.out.println("NOT ELIGIBLE");
		}
		in.close();

	}
	

}
