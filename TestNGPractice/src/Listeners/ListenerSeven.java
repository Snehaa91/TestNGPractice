package Listeners;

import org.testng.IConfigurable;
import org.testng.IConfigureCallBack;
import org.testng.ITestResult;

public class ListenerSeven implements IConfigurable {

	@Override
	public void run(IConfigureCallBack callBack, ITestResult testResult) {
		callBack.runConfigurationMethod(testResult);
		
	}

}
