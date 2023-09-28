package TestProperties;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

;


public class FailedTeseCaesListiners implements ITestListener{
	
	 @Override
	    public void onTestStart(ITestResult result) {
	        
	    }
	 
	 @Override
	    public void onTestFailure(ITestResult result) {
		 
		 
	      
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	       
	    }

	
	    @Override
	    public void onFinish(ITestContext context) {
	        System.out.println("All tests finished");
	    }

}
