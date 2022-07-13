package oom;
import java.util.*;
public class Oops {
	public static void main(String[]args) {
		Ex e;
		e=new Ex();
		e=new Ex(6);
	
	}
}
class Ex{
	int g=10;
	Ex(int a){
		System.out.println(g);
	}
	Ex(){
		System.out.println("---");
	}
}

