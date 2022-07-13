package Patterns;

class Superconstructorclass {
	
	//constructor
	Superconstructorclass(int a){
		System.out.println("Constructor of parent class"+a);
	}
	Superconstructorclass(){
		System.out.println("Constructor of parent class");
	}
}
class Subsuperclass extends Superconstructorclass{
	
	//sub class constructor
	Subsuperclass(){
	//super(5);
		System.out.println("Constructor of subclass");
	}
}
public class Pattern {

	public static void main(String[] args) {
		
		Subsuperclass subsuperclass=new Subsuperclass();
	}
}
		
//		for(int k=1; k<=5; k++) {
//			for(int l=1; l<=k; l++ ) {
//				System.out.print("*");	
//			}
//			System.out.println();		
//		}
//		for(int k=5; k>=1; k--) {
//			for(int l=k; l>=1; l--) {
//				System.out.print("*");
//			
//			}
//			System.out.println();
//			
//		}
//	
//		System.out.println("----------------------------------");
//		for(int k=1; k<=5; k++) {
//			for(int l=1; l<=k; l++ ) {
//				System.out.print("*");	
//			}
//			System.out.println();		
//		}
//		int iterr=5;
//		for(int k=1; k<=iterr; k++) {
//			for(int l=iterr; l>=k; l-- ) {
//				System.out.print("*");	
//			}
//			System.out.println();		
//		
//		}
//	

		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		

