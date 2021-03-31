package Listeners;

import org.testng.IConfigurationListener;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

public class ListenerFive implements IHookable{

	@Override
	public void run(IHookCallBack callBack, ITestResult testResult) {
		callBack.runTestMethod(testResult);
	}
	
		
	}


