package oom;

public class Brekabdcontinue {
	public static void main(String[]args) {
		
		//CONTROL STATEMENTS
		
		for(int i=1;i<5;i++) {
			for(int i1=01;i1<5;i1++) {
				if((i==2)&&(i1==2))
					break;
				System.out.println(i+" "+i1);
			}
				
			}
		System.out.println("-------------");
		for(int i=1;i<5;i++) {
			for(int i1=01;i1<5;i1++) {
				if((i==2)&&(i1==2))
					continue;
				System.out.println(i+" "+i1);
			}
			
			}
		
		System.out.println("------------");
		for(int i=1;i<=10;i++) {
			if((i==3)||(i==4)||(i==5))
				continue;
			System.out.println(i);
			
		}
		}
	}


