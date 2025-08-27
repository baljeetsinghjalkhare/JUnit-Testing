package com.bs;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculateService {
    private CalculateService service=new CalculateService(); 
	@Test
	public void testAddPositive() {
		int actual=service.add(10,20);
		int expected=30;
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testAddNegative() {
		int actual=service.add(-10,-19);
	    int exepcted=-29;
	    assertEquals(exepcted, actual);
	}

}
