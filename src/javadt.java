package oom;

public class javadt {
	public static int a=10;
	public int b=10;
	//
	public int mymethod()
	{
		String s="harsha";
		System.out.println(s);
		return 3;
	}
	public void mymethod1()
	{
		String s="harsha1";
		System.out.println(s);
	}
	public void mymethod2()
	{
		//public static int c=20;//Not possible
		String s="harsha2";
		System.out.println(s);
	}
		public static void main(String [] args)
		{
 
	 System.out.println();
	 int a=10;
	 
	 javadt m=new javadt();
	 m.mymethod();
	 m.mymethod1();
	 m.mymethod2();
	 //
	 int  gg=m.mymethod();
	 System.out.println(javadt.a);
	 System.out.println(m.b);
	 
;
	 }
}
