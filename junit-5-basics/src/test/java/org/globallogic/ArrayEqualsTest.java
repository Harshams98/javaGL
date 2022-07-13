package org.globallogic;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class ArrayEqualsTest {

	@Test
	public void test() {
		ArrayEquals obj=new ArrayEquals();
		
		int []expected= {1,2,3,4};
		int []a= {1,2};
		int []b= {3,4};
		int []actual=obj.arr(a,b);
		assertArrayEquals(expected,actual);
	}

}
