package oom;
import java.util.*;
public class Primewoo {
	public static void main(String[]args) {
	int i=1;
	
	Primewoo.looping(i);
	

}

	private static void looping(int i) {
		// TODO Auto-generated method stub
		Priim p;
		System.out.println("Enter number to check prime");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		p=new Priim(a);
		
		int f=p.primee(2);
		if(f!=0) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
			
		}
		if(i<=5)
			looping(i++);
		
		
	}}
class Priim{
	int flag=0,number;
	Priim(int number){
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