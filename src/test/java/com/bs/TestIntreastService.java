package com.bs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestIntreastService {
  private IntreastService is=new IntreastService();

	@Test(timeout = 5000)
	public void testgetCivilScore() {
		int n=is.getCivilScore();
		System.out.println(n);
	}
	
	
	  @BeforeClass
	  public static void init() {
		  System.out.println("once testing before class.....");
	  }
	  
	  @AfterClass
	  public static void close() {
		  System.out.println("Test case End.......");
	  }
	 @Before
	 public void start()
	 {
		 System.out.println("Starting test case.....");
	 }
	 
	 @After
	 public void end() {
		 System.out.println("Ending of test case....");
	 }
	 
	 
     
     @Ignore
     @Test
     public void testgetIFSCNull()
     {
    	 System.out.println("otestgetIFSCNull().....");
    		
    	 String actual=is.getIFSC("delhi");
    	 assertNull(actual);
     }
     
     @Test
     public void testgetIFSCNotNull()
     {
    	 System.out.println("testgetIFSCNotNull()");
    	 String actual=is.getIFSC("bhopal");
    	 assertNotNull(actual);
     }
     @Test
     public void testLoanEligibilityPositve()
     {
    	 System.out.println("testLoanEligibilityPositve()");
    	 boolean actual=is.LoanEligilibity(60000);
         assertTrue(actual);
//    	 boolean expected=true;
//    	 assertEquals(actual,expected);
     }
     
     @Test
     public void testLoanEligibilityNegative()
     {
    	 System.out.println("testLoanEligibilityNegative()");
    	 boolean actual=is.LoanEligilibity(40000);
    	 
    	 assertFalse(actual);
     }
	@Test
	public void testIntreastComputeForMoreThanFiveYears() 
	{
		
		 System.out.println("testIntreastComputeForMoreThanFiveYears()");
		 IntreastService is=new IntreastService();
         int actual=is.IntreastCompute(10000,6);
         int expected=6000;
         assertEquals(expected,actual);
	}
	
	@Test
	public void testIntreastComputeForLessThanFiveYears()
	{
		
		 System.out.println("testIntreastComputeForLessThanFiveYears()");
		 IntreastService is=new IntreastService();
         int actual=is.IntreastCompute(10000,4);
         int expected=3200;
         assertEquals(expected,actual);
	}
	
	@Test
	@Ignore
	public void testIntreastComputeoForNegativeTime()
	{
		
		 System.out.println("testIntreastComputeoForNegativeTime()");
		 IntreastService is=new IntreastService();
         int actual=is.IntreastCompute(10000,-4);
         int expected=0;
         assertEquals(expected,actual);
	}
	
	@Test(expected=NegativeTimeException.class)
	public void testIntreastComputeoForNegativeTimeException()
	{
		
		 System.out.println("testIntreastComputeoForNegativeTime()");
		 IntreastService is=new IntreastService();
         int actual=is.IntreastCompute(10000,-4);
        
	}

}
