package com.bs;

public class TicketService {
public int getMaxDaysSolutions(String priority)
{
	if(priority.equalsIgnoreCase("p1")){
		return 1;
	}
	else if(priority.equalsIgnoreCase("p3")){
		return 3;
	}
	else if(priority.equalsIgnoreCase("p5")) {
		return 5;
	}
	else if(priority.equalsIgnoreCase("p8")) {
		return 8;
	}
	else {
		return 10;		
	}
}
}
