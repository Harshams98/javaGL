package oom;
import java.util.*;
public class prime {
	public static void main(String[]args) {
	Pri p=new Pri();	
	Scanner sc=new Scanner(System.in);
	for(int i=1;i<=5;i++) {
	int numb=sc.nextInt();
	p.primee(numb);
	}
	sc.close();
	}
	

}
class Pri{
	int flag=0;
	
	public void primee(int number) {
		if(number==2) {
			System.out.println("prime");
		}
		else {
		for (int i=2;i<number;i++) {
			if(number%i==0) {
				flag++;
			}
			
		}
		if(flag!=0) {
			System.out.println("Not Prime");
			flag=0;
		}
		else {
			System.out.println("Prime");
			flag=0;
			
		}}
		
	}
	
	
	
}