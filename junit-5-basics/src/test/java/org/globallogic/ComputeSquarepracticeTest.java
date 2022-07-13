package org.globallogic;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class ComputeSquarepracticeTest {

	Scanner sc=new Scanner(System.in);
	
	
	public ComputeSquarepractice obj;
	
	@BeforeEach
	public void init() {
		this.obj=new ComputeSquarepractice();
	}
	
	@BeforeEach
	public void clean() {
		System.out.println("cleaning up");
	}
	
	//creating an test annotation 

	@Test
	public void test() {
		//creating object of main class
		ComputeSquarepractice obj=new ComputeSquarepractice();
		int actual=obj.add(2, 16);
		int expected=18;
		
		//importing assert from upiter.api.Assertions
		assertEquals(expected,actual);
		System.out.println("The add method values are Equal");
		
	}
	//creating an test annotation 
	@Test
	public void computetest() {
		//creating object of main class
		ComputeSquarepractice obj=new ComputeSquarepractice();
		double actual = obj.computesquare(3.5, 3.0);
		double expected =10.5;
		
		//importing assert from upiter.api.Assertions
		assertEquals(expected,actual);
		System.out.println("the area of square is as expected = "+actual);
	}
	
	//creating an test annotation 
	@BeforeEach
	@Test
	public void computecircletest() {
		//creating object of main class
		ComputeSquarepractice obj=new ComputeSquarepractice();
		double actual = obj.computescircle(5.5);
		double expected =95.0;
	
		//importing assert from upiter.api.Assertions
		assertEquals(expected,actual);
		System.out.println("the area of circle is as expected = "+actual);
		
		
	}
	@BeforeAll
	@Test
	public void testdiv() {
		//creating object of main class
		ComputeSquarepractice obj=new ComputeSquarepractice();
		assertThrows(ArithmeticException.class,()->obj.divide(10, 0));
	//assertThrows(ArithmeticException.class,()->obj.divide(10, 0));
		
	}
	
	public void testadd() {
		//creating object of main class
		ComputeSquarepractice obj=new ComputeSquarepractice();
		System.out.println("enter no to add");
	
	assertThrows(Exception.class,()->obj.adding(sc.nextInt(), sc.nextInt()));
		
	}
	@AfterAll
	@Test
	public void testmul() {
		//creating object of main class
		ComputeSquarepractice obj=new ComputeSquarepractice();

		
	assertThrows(Exception.class,()->obj.multiply(6, 6));
	System.out.println("This is After all");
		
	}
	@Test
	public void testsub() {
		//creating object of main class
		ComputeSquarepractice obj=new ComputeSquarepractice();
		System.out.println("enter no to sub");
		
	assertThrows(Exception.class,()->obj.sub(sc.nextInt(), sc.nextInt()));
		
	}
	@BeforeAll
	@Test
	public void testmod() {
		//creating object of main class
		ComputeSquarepractice obj=new ComputeSquarepractice();
	assertThrows(ArithmeticException.class,()->obj.modiles(10, 0));
	System.out.println("This is before all");
		
	}

}
