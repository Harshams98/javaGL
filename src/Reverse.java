package oom;

import java.util.Scanner;

public class Reverse {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numb;
		Pall p=new Pall();
		
		for(int i=1;i<=5;i++) {
			System.out.println("enter "+i+" number");
			numb=sc.nextInt();
		int flag=p.cal(numb);
		
		
		System.out.println("the reverse of given number is = "+flag);
		}
		sc.close();
		
		
		
	}
	
	
	
	
	}
class Pall{
	
	public int cal(int number) {
		int sum=0,r;
		
		
		while (number>0)
		{
			r=number%10;
			sum=10*sum+r;
			number = number/10;
			
		}
		return sum;
	}
}



