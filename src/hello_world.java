package oom;
//import java.util.*;
public class hello_world {
public static void main(String args[]){
	//creating an object
	Hello h1;
	h1=new Hello();
	//calling an object method
	h1.printhello();
			}
}
class Hello{
	public void printhello() {
		System.out.println("hello_world!");
		System.out.println("---------------");
		int a= 1&3;
		a=2&3;
		System.out.println(a);
		
		//logical operator
		
		boolean a1=true;
		boolean a2=false;
		System.out.println(a1&&a2);
		System.out.println(a1||a2);
		int n1=1,n2=703456789;
		System.out.println(n2);
	}
}

