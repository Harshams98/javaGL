package org.globallogic;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.Test;

public class EvenOddTest {

	@Test
	public void testEveorodd() {
		Scanner sc=new Scanner(System.in);
		//creating object of main class
		EvenOdd obj=new EvenOdd();
		int num=sc.nextInt();
		String actual=obj.eveorodd(num);
		String expected;
		
		//assigning expected values 
		if(num%2==0)
			expected="even";
		else
			expected="odd";
		
		//importing assert from upiter.api.Assertions
		assertEquals(actual,expected);
		System.out.println("The Given No is : "+actual);
	}

}
