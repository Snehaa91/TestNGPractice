package TestNGClasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SecondTestNGclass {
	
	@DataProvider (name = "ValuesGiven")
	public Object[][] dpmethod(){
		return new Object[][] {{55},{66}};
	}
	
	
	@Test (groups = {"BrowserOpening"}, dataProvider = "ValuesGiven")
	public void OpenBrowser(int val) {
		  int result = val;
		  System.out.println("Browser is opened " + result);
	  }
	  
	  @Test (groups = {"AccountDetails"})
	  public void ViewAccount() {
		  Reporter.log("Here account is validated correctly");
		  String originaltext = "Open";
		  String expectedtext = "OPen";
		  //Assert.assertNotEquals(originaltext, expectedtext);
		  SoftAssert sftasrt = new SoftAssert();
		  sftasrt.assertEquals(originaltext, expectedtext, "Not Matching");
		  //sftasrt.assertAll();
		  
		  System.out.println("Account is opened");
	  }
	  
	  @Test (groups = {"LoggedIn"})
	  public void logIn() {
		  System.out.println("Logged in ");
	  }
	  
	  @Test (groups = {"SignOut"})
	  public void logout() {
		  System.out.println("Logged out");
	  }

}
