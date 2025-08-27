package com.bs;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class TestTicketService {
private String priority;
private int expected;


	public TestTicketService(String priority, int expected) {
	super();
	this.priority = priority;
	this.expected = expected;
}
	
	@Parameterized.Parameters
	public static Collection dataSet() {
		return Arrays.asList(new Object[][]{{"p1",1},{"p3",3},{"p5",5},{"p8",8},{"p10",10}}); 
	}


	@Test
	public void testGetMaxDaysSolutions() {
		TicketService service	=new TicketService();
		int actual=service.getMaxDaysSolutions(priority);
	    assertEquals(expected,actual);
	}

}
