package org.globallogic;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathTestCase {

	@Test
	public void multiply() {
		
		final int res=Math.multiplyExact(5, 2);

		assertEquals(10,res);
		
	}
}
