package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassFive {

	//(retryAnalyzer = Listeners.ListenerRetry.class) 
	@Test
	@RetryCountIfFailed(10)
	public void Test1() { //failing this script
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test2() { //failing this script
		Assert.assertEquals(false, true);
	}
}
