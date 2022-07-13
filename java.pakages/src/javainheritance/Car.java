package javainheritance;
import java.util.*;
public class Car {
	//instance variables
	//states the car
	 String color,brand,model;
	 int mfy;
	 
	 //parameterized constructor 
 public Car(String color, String brand, String model, int mfy) {
		
		this.color = color;
		this.brand = brand;
		this.model = model;
		this.mfy = mfy;
	}
 
 void topspeed(){
	 System.out.println("top speed is 220 miles per hour");
 }
 void accelarate() { System.out.println("--------------------");
	 System.out.println("Car is going");
 }
 
 void sound() {
	 System.out.println("--------------------");
	 System.out.println("car goes vroom vroom");
 }
 void breaks() {
	 System.out.println("--------------------");
	 System.out.println("car is stopped");
 }
 


	@Override
public String toString() {
		topspeed();
		sound();
	return "Car [\ncolor=" + color + ", \nbrand=" + brand + 
			", \nmodel=" + model + ", \nmfy=" + mfy + "]";
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c;
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter color of the car");
		String color=sc.next();

		System.out.println("enter brand of the car");
		String brand=sc.next();

		System.out.println("enter model of the car");
		String model=sc.next();

		System.out.println("enter manufacturing year of the car");
		int mfy=sc.nextInt();

		//passing args
		c=new Car(color,brand,model,mfy);
		//calling
		System.out.println("-------------------------\n"+
		c.toString());
		c.accelarate();
		c.breaks();

	}

}
