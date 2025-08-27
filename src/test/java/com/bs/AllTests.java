package com.bs;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCalculateService.class, TestIntreastService.class, NewTest.class, TestTicketService.class, ParamTest.class })
public class AllTests {

}
