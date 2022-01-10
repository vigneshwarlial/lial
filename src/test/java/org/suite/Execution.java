package org.suite;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
public class Execution {

	  @Test
	  public void finalReport() {
		  Result res = JUnitCore.runClasses(Employee.class,Company.class,Client.class);
		  
		  System.out.println("Run Count:"+ res.getRunCount());
		  
		  System.out.println("Ignore Count:"+ res.getIgnoreCount());
		  
		  System.out.println("Failure Count:"+ res.getFailureCount());
		  
		  int passcount = res.getRunCount() - res.getFailureCount();
		  
		  System.out.println("Pass Count:"+ passcount);
		  
		  System.out.println("Run Time :"+ res.getRunTime());
		  
		  List<Failure> list = res.getFailures();
		  
		  for (Failure x : list) {
			  System.out.println(x);
			
		}
		  
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
