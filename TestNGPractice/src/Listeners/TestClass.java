package Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void display() {
		System.out.println("Success method should be invoked");
	}
	
	private int i = 1;
	@Test(successPercentage = 60, invocationCount = 2)
	public void division() {
		if(i<2) {
			Assert.assertEquals(i, i);
			i++ ;
			System.out.println("OnTestFailedWithinSuccessPercentage");
		}
		
	}
	
	

}
