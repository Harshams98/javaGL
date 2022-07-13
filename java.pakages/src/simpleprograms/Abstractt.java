package simpleprograms;
//creating a abstract class
abstract class Animal{
	//creating a abstract method 
	String animal="Tiger";
	abstract void Sound() ;
	//can't have body
	
}//creating a abstract class
abstract class Bank{
	//creating a aabstract method
	abstract void bankbal();
	abstract void acctype();//can't have body
	
}
class Tiger extends Animal {
	
	@Override
	void Sound() {
		System.out.println(animal+" : "
				+ "Is the National animal of India!");
	}	
}
class Dog extends Animal {
	
	@Override
	void Sound() {
		System.out.println("Dog : Woof! woof!");
	}	
}
class Lion extends Animal {
	
	@Override
	void Sound() {
		System.out.println("Lion : roar! ");
	}	
}
class Savings extends Bank{

	@Override
	void bankbal() {
		System.out.println("current bal is = "+45000);
		
	}
	void acctype() {
		System.out.println("Savings Account");
	}
	
}
public class Abstractt {

	public static void main(String[] args) {
	//typecastin for abstract
//		Animal obj=new Tiger();
//		obj.Sound();
		Animal obje=new Dog();
		obje.Sound();
		Animal objec=new Lion();
		objec.Sound();
		System.out.println("===========BANK===========");
		
		Bank o=new Savings();
		o.acctype();
		o.bankbal();
		

	}

}
