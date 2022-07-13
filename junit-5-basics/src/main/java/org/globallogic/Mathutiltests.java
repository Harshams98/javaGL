package org.globallogic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Mathutiltests {
	@Test
	public void tset() {
		MathUnit mathUnit=new MathUnit();
		
		int expected=20;
		int actual=mathUnit.display(10, 10);
		assertEquals(expected,actual);
		System.out.println("Expected 20 got 20");
	}
	@SuppressWarnings("deprecation")
	@Test
	public void tsetcomputerarea() {
		MathUnit mathUnit=new MathUnit();
		double d=mathUnit.computercirclearea(6.88);
		assertEquals(3.1456,d,9);
	}
		
	
	
	
	public static void main(String[] args) {
			Mathutiltests n=new Mathutiltests();
			n.tsetcomputerarea();
			
		}
		
	

}
