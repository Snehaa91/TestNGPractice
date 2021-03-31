package TestNGClassesDPExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.ExcelDataProvider;

public class DataProviderExcel {
	
	private static WebDriver driver;
	
	@DataProvider(name="CredentialDetails")
	public static Object[][] getdata() {
		String excelpath = "D:\\Users\\SKhuswah\\eclipse-workspace\\TestNGPractice\\src\\Resources\\CredentialsData.xlsx";
		Object[][] data = ExcelDataProvider.testdata(excelpath, "Data1");
		
		return data;
		
	}
		
	@Test(dataProvider = "CredentialDetails")
	public void LoginTest(String username, String password) {
		
		System.out.println("username "+ "|" + "password");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SKhuswah\\eclipse-workspace\\TestNGPractice\\src\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_AccountFlyout_signout%26signIn%3D1%26useRedirectOnSuccess%3D1");
		driver.findElement(By.id("ap_email")).sendKeys(username);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("signInSubmit")).click();
		driver.quit();		
	}
	
}

/*
 * @DataProvider(name = "CredentialDetails") public static Object[][]
 * dpmethod(){ return new Object[][] {{"snehaa91@gmail.com",
 * "Ziddi@0291"},{"amazon@gmail.com","amazon@123"}}; }
 */