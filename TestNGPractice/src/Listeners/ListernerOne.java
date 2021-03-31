package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;

public class ListernerOne implements ITestListener{
	
	public void OnStart(ITestContext context) {
		System.out.println("OnStart method is invoked");
	}
	
	public void OnFinish(ITestContext context) {
		System.out.println("OnFinish method is invoked");
	}
	
	public void OnTestStart(ITestResult result) {
		System.out.println("OnTestStart method is invoked");
	}
    
	public void OnTestSuccess(ITestResult result) {
		System.out.println("OnTestSuccess method is invoked");
	}
	
	public void OnTestFailure(ITestResult result) {
		System.out.println("OnTestFailure method is invoked");
	}
	
	public void OnTestSkipped(ITestResult result) {
		System.out.println("OnSkipped method is invoked");
	}
	
	public void OnTestFailedWithinSuccessPercentage(ITestResult result) {
		System.out.println("OnTestFailedWithinSuccessPercentage method is invoked");
	}
	
	
}
