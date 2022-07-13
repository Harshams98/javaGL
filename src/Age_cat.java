package oom;
import java.util.*;
public class Age_cat {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		System.out.print("YOU ARE ");
		if((age>0)&&(age<=10)) {
			System.out.println("KID");
		}
		else if((age>10)&&(age<19)) {
			System.out.println("TEEN");
		}
		else if((age>19)&&(age<60))
		{
			System.out.println("ADULT");
		}
		else if((age>60)&&(age<=100)) {
			System.out.println("OLD");
		}
		else {
			System.out.println("UN_CATAGORIZED");
		}
		sc.close();
	}
}
