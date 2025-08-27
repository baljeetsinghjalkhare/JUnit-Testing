package com.bs;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class IntreastService {
	
	
	public int getCivilScore() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		return new Random().nextInt(100);
	}
	
    public String getIFSC(String branch) {
    	Map<String,String> map=new HashMap<String,String>();
    	map.put("indore","sbi123");
    	map.put("bhopal", "sbi321");
    	return map.get(branch);
    }
	public boolean LoanEligilibity(int balance)
	{
		if(balance>=50000)
		return true;
		
		else return false;
	}
	
	public int IntreastCompute(int principle,int time)
	{
		 int intreast=0;
		 int rate=0;
		 if(time<0) {
			 throw new NegativeTimeException();
//			 return 0;
		 }
		if(time>=5) {
			rate=10;
		}
		else {
			rate=8;
		}
		intreast=principle*rate*time;
		intreast/=100;
		return intreast;
		
	}
	public static void main(String[] args) {
		
		IntreastService t=new IntreastService();
		// TODO Auto-generated method stub
		int x=t.IntreastCompute(10000,6);
    System.out.println(x);
	}

}
