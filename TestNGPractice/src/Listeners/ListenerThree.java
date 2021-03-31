package Listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class ListenerThree implements ISuiteListener{
	
	public void OnStart(ISuite suite) {
		System.out.println("OnStart method of IsuiteListener is invoked");
	}
	
	public void OnFinish(ISuite suite) {
		System.out.println("OnFinish method of IsuiteListener is invoked");
	}

}
