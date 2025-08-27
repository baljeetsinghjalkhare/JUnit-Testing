package com.bs;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculateService {
    private CalculateService service=new CalculateService(); 
	@Test
	public void testAddBothPositive() {
		int actual=service.add(10,20);
		int expected=30;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAddFirstPositiveSecondNegative() {
		int actual=service.add(10,-20);
		int expected=-10;
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testAddFirstNegativeSecondPositive() {
		int actual=service.add(-10,20);
		int expected=10;
		assertEquals(expected, actual);
		
	}
	@Test
	public void testAddBothNegative() {
		int actual=service.add(-10,-19);
	    int exepcted=-29;
	    assertEquals(exepcted, actual);
	}

}
