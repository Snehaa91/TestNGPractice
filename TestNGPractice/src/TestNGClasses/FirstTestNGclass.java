package TestNGClasses;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FirstTestNGclass {
	
	WebDriver driver;
	
  @Test(groups = {"Run1"})
  public void f(int v1, int v2) {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\\\Users\\\\SKhuswah\\\\eclipse-workspace\\\\JavaProject\\\\src\\\\Selenium\\\\Driver\\\\chromedriver.exe"
		 * ); driver = new ChromeDriver(); driver.get(
		 * "https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fcustomer-preferences%2Fselect-language%2Fref%3Dnav_signin%3FpreferencesReturnUrl%3D%252Fgp%252Fcustomer-preferences%252Fselect-language%252Fref%253Dtopnav_lang%253FpreferencesReturnUrl%253D%25252F&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&"
		 * );
		 */
	  int multiplyresult = v1*v2;
	  System.out.println("Without any annotations " + multiplyresult);
  }
  
  @Test (priority=2, groups = {"Run1"})
  public void gas() {
	  System.out.println("gas method");
  }
  
  @Test (priority=1)
  public void liquid() {
	  System.out.println("liquid method");
  }
  
  @Test (priority=1, groups = {"Run1"})
  public void solid() {
	  System.out.println("solid method");
  }
  
  @BeforeMethod(groups = {"Run1"})
  public void beforeMethod() {
	 System.out.println("Before Executing the f() method for launching amazon site execute this");
  }

  @AfterMethod(groups = {"Run1"})
  public void afterMethod() {
	  System.out.println("After launching amzon site i.e. aftermethod");
  }

}
