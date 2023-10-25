package Tests;
//iTestListener interface which implements TestNG listeners
import org.testng.ITestContext;
import org.testng.ITestListener;
//import org.testng.ITestNGListener;
import org.testng.ITestResult;


public class Listeners implements ITestListener
{
	
	@Override
	public void onTestStart(ITestResult result) {
	    
	  }

	@Override  
	public void onTestSuccess(ITestResult result) {
	    System.out.println("Successfully executed Listeners Pass code");
	  }

	 
	@Override
	public void onTestFailure(ITestResult result) {
	    // not implemented
		//lets say if test fails we can add screenshot code
		System.out.println("Successfully failed Listeners Pass code" +result.getName()); // result will store all info in ...
		//ITestResult - class that describes the result of a test
	  }

	  
	@Override
	public void onTestSkipped(ITestResult result) {
	    // not implemented
	  }

	  
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	  
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	  
	@Override
	public void onStart(ITestContext context) {
	    // not implemented
	  }

	  
	@Override
	public void onFinish(ITestContext context) {
	    // not implemented
	
	
	}	

}
