package oom;
import java.util.*;
public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numb;
		Pal p=new Pal();
		
		for(int i=1;i<=5;i++) {
			System.out.println("enter "+i+" number");
			numb=sc.nextInt();
		int flag=p.cal(numb);
		
		
		if(flag==0) {
			System.out.println("not a palindrome");
		}
		else {
			System.out.println("yes it's a palindrome");
			flag=0;
		}
		}
		sc.close();
		
		
		
	}
	
	
	
	
	}
class Pal{
	
	public int cal(int number) {
		int sum=0,r;
		int n1=number;
		
		while (number>0)
		{
			r=number%10;
			sum=10*sum+r;
			number = number/10;
			
		}
		if(sum==n1)
			{
			return 1;
			}
		else {
			return 0;
		}
	}
}


