package testng.sample;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {
	 @Override  
	    public void onTestStart(ITestResult result) {  
	        // TODO Auto-generated method stub  
	          
	    }  
	  
	    @Override  
	    public void onTestSuccess(ITestResult result) {  
	        // TODO Auto-generated method stub  
	        System.out.println("Success of test cases and its details are : "+result.getName());  
	    }  
	  
	    @Override  
	    public void onTestFailure(ITestResult result) {  
	        // TODO Auto-generated method stub  
	        System.out.println("Failure of test cases and its details are : "+result.getName()+" // "+result.getThrowable());  
	    }  
	  
	    @Override  
	    public void onTestSkipped(ITestResult result) {  
	        // TODO Auto-generated method stub  
	        System.out.println("Skip of test cases and its details are : "+result.getName());  
	    }  
	  
	    @Override  
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
	        
	    }  
	  
	    @Override  
	    public void onStart(ITestContext context) {  
	        System.out.println("Test Started");
	          
	    }  
	  
	    @Override  
	    public void onFinish(ITestContext context) {  
	        System.out.println("Test End"); 
	          
	    }  
}
