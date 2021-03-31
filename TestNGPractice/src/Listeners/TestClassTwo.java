package Listeners;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClassTwo {
	
	
	@BeforeSuite
	 public void bsuite(){
	    System.out.println("BeforeSuite method started"); 
	 }
	 	 
	 @Test
	 public void test(){
	 System.out.println("Test Method started");
	 }
	 
	 @AfterSuite
	 public void asuite(){
	    System.out.println("AfterSuite method started"); 
	 }
	
	 /*
		 * @Test public void firstMethod() { Assert.assertTrue(true); }
		 * 
		 * @Test public void secondMethod() { Assert.assertTrue(false); }
		 * 
		 * @Test(dependsOnMethods = {"firstMethod"}) public void thirdMethod() {
		 * Assert.assertTrue(true); }
		 */
	
}
