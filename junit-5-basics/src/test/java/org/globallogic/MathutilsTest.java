package org.globallogic;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class MathutilsTest {


	@Test
	public void test() {
		Mathutils obj=new Mathutils();
	 int res=obj.add(2, Math.addExact(2, 0));
	 //comes from java 
	 System.out.println("this will print test pass or fail");
	 
	 //comes from junit
	 assertEquals(4,res);
	 
	 //java runs separate junit runs separate
	 System.out.println("expected value is 4 and got 4");
		
		
	}

}
