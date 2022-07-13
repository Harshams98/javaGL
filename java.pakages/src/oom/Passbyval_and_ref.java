package oom;

public /*final*/ class Passbyval_and_ref {

public static int exx;
 Object aone="harsha";
	public static void ref(int[] aa)
	{
		aa[0]=99;
		System.out.println(aa[0]);
		exx=1;
		System.out.println(exx);
	}
	 static void theObject(Object ex)
	{
		ex="mahendarkar";
		System.out.println(ex);
	}
	
	public static void main(String[]args) {
		int[] a= {12,76,778};
		Passbyval_and_ref ex=new Passbyval_and_ref();
		ex.exx=0;
		// a="23";
		ref(a);
		System.out.println(a[0]);
		System.out.println(exx);
		
		
		theObject(ex.aone);
		System.out.println(ex.aone);
		
		//final variable
		
		final int exampleno=0;
		/*
		 * exampleno=99;//ERROr DUE TO USING FINAL VARIABLE
		 */		
		Passbyval_and_ref pass=new EXXXXX();//upcasting
		
		EXXXXX paass=(EXXXXX)new Passbyval_and_ref();//Downcasting
	}
}
//class EXXXXX extends Passbyval_and_ref{
//	//ERROR DUE TO USING FINAL
//}
class EXXXXX extends Passbyval_and_ref{
//ERROR DUE TO USING FINAL
}

