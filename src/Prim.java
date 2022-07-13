package oom;
import java.util.*;
public class Prim {
	public static void main(String[]args) {
	Priim1 p;	
	Scanner sc=new Scanner(System.in);
	for(int i=1;i<=5;i++) {
	
	System.out.println("Enter number to check prime");
	
	int a=sc.nextInt();
	p=new Priim1();
	p.primee(a);
	
	}
	
	sc.close();
}}
class Priim1{
	int flag=0,number;
	
	
	public void primee(int number) {
		
		if((number==2)||(number==3)||(number==5)||(number==7))
		{
			System.out.println("Prime");
		}
		else if((number%2==0)||(number%3==0)||(number%5==0)||(number%7==0)){
			System.out.println("Not prime");
		}
		else
		{
			System.out.println("Prime");
		}
		
				
						}
			
			
	
		
		
	
	
	
	
}