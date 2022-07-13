package oom;

public class recursive {
	
	//recursive 
//fraction
	
	
	public static int fact(int num) {
		
		if((num==0)||(num==1)) {
			return 1;
		}
		else {
			return num*fact(num-1);
		}
	}

		//fibbo
		static int n1=0,n2=1,n3=0;
		static int count=0;
		public static void fibbo(int numb) {
			
			if((n1==0)&&(n2==1)) {
			System.out.print(n1+" "+n2);
			count+=2;
			}
			
				n3=n1+n2;
				System.out.print(" "+n3+" ");
				n1=n2;
				n2=n3;
				
				
			if(count<numb) {
				count++;
				fibbo(numb);
				
			}	
		}
		
	
	public static void main(String[] args) {
	

		//System.out.println(fact(7));
		fibbo(14);
		
	}

}
