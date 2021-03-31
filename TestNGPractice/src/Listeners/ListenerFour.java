package Listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class ListenerFour implements IInvokedMethodListener{
	
	public void beforeInvocation(IInvokedMethod m1, ITestResult testresult) {
		System.out.println("Before Invocation method is invoked: " + m1.getTestMethod());
		
	}
	
	public void afterInvocation(IInvokedMethod m2, ITestResult testresult)
	{
		System.out.println("After invocation method is invoked: " + m2.getTestMethod());
	}
}
