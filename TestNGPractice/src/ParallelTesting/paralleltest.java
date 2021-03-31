package ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class paralleltest {
	
	public WebDriver driver;
	
	@Test
	public void chrometest() {
		System.getProperty("webdriver.chrome.driver", "D:\\Users\\SKhuswah\\eclipse-workspace\\TestNGPractice\\src\\Resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        System.out.println(driver.getTitle());
	}
	
	@Test
	public void firefox() {
		System.getProperty("webdriver.gecko.driver", "D:\\Users\\SKhuswah\\eclipse-workspace\\TestNGPractice\\src\\Resources\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
        capabilities.setCapability("marionette",true);
		driver = new FirefoxDriver(capabilities);
        driver.get("https://www.amazon.in/");
        System.out.println(driver.getTitle());
	}

}
