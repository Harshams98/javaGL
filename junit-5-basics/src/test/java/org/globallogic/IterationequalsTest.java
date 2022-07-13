package org.globallogic;


import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class IterationequalsTest {

	@Test
	public void test() {
		Iterationequals obj=new Iterationequals();
		
		List<Object> li=new LinkedList<Object>();
		li.add("Harsha");
		li.add("Mahendrkar");
		li.add("Mahendrkar");
		@SuppressWarnings("unchecked")
		Iterable<Object> it=  (Iterable<Object>) li.iterator();
		
		assertIterableEquals(it,it);
		
	}

	
	

}
