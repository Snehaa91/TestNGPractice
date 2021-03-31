package Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ListenerRetry implements IRetryAnalyzer{

	int counter = 0;
	int RetryLimit = 3;

	@Override
	public boolean retry(ITestResult result) {

		if(counter<RetryLimit) {
			counter++;
			return true;
		}

		return false;
	}

}
