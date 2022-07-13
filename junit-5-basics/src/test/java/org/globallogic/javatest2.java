package org.globallogic;

import static org.junit.Assert.*;

import org.junit.Test;

public class javatest2 {

	@Test
	public void test() {
		MathUnit mathUnit=new MathUnit();
		double d=mathUnit.computercirclearea(6.88);
		assertEquals(3.456,d,7.99);
	}

}
