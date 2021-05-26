package testng.sample;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_analyser implements IRetryAnalyzer {

	int count = 0;
	int retrylim = 3;
			
	@Override
	public boolean retry(ITestResult result) {
		
		while (count < retrylim) {
			count++;
			System.out.println("Retry "+count+" "+result.getName());
			return true;
		}
		
		return false;
	}

}
