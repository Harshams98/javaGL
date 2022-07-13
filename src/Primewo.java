package oom;
import java.util.*;
public class Primewo {
	public static void main(String[]args) {
	Prii p;	
	Scanner sc=new Scanner(System.in);
	for(int i=1;i<=5;i++) {
	
	System.out.println("Enter number to check prime");
	
	int a=sc.nextInt();
	p=new Prii(a);
	
	int f=p.primee(2);
	if(f!=0) {
		System.out.println("Not Prime");
	}
	else {
		System.out.println("Prime");
		
	}
	
	}
	
	sc.close();
}}
class Prii{
	int flag=0,number;
	Prii(int number){
		this.number=number;
	}
	
	public int primee(int i) {
		
		if(number==2) {
			System.out.println("prime");
			return 0;
		}
		 
			if(number%i==0) {
				flag++;
			}
			
			if(i<(number/2)+1) {
				primee(++i);
				return flag;
						}
			
			return flag;
	
		
		
	}
	
	
	
}