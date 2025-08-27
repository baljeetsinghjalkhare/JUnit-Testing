package com.bs;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamTest {
private int num1;
private int num2;
private int expected;

	public ParamTest(int num1, int num2, int expected) {
	super();
	this.num1 = num1;
	this.num2 = num2;
	this.expected = expected;
}

	@Test
	public void testAllAdd(){
		CalculateService service=new CalculateService();
        int actual=service.add(num1,num2);
	    assertEquals(expected, actual);
	}
	
	
	@Parameterized.Parameters
	public static Collection dataSet() {
		return Arrays.asList(new Object[][]{{10,20,30},{10,-20,-10},{-10,20,10},{-10,-20,-30}});
	}

}
